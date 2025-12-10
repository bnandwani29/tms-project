package com.bhavya.tms.service;

import com.bhavya.tms.entity.Bid;
import com.bhavya.tms.entity.TransporterTruck;
import com.bhavya.tms.entity.enums.BidStatus;
import com.bhavya.tms.repository.BidRepository;
import com.bhavya.tms.repository.TransporterTruckRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class BidService {

    private final BidRepository bidRepository;
    private final TransporterTruckRepository transporterTruckRepository;

    public BidService(BidRepository bidRepository,
                      TransporterTruckRepository transporterTruckRepository) {
        this.bidRepository = bidRepository;
        this.transporterTruckRepository = transporterTruckRepository;
    }

    // ✅ SUBMIT BID WITH CAPACITY VALIDATION
    public Bid submitBid(Bid bid) {

        UUID transporterId = bid.getTransporterId();

        List<TransporterTruck> trucks =
                transporterTruckRepository.findByTransporterId(transporterId);

        if (trucks.isEmpty()) {
            throw new RuntimeException("Transporter has no registered trucks");
        }

        TransporterTruck transporterTruck = trucks.get(0);

        if (bid.getTrucksOffered() > transporterTruck.getAvailableCount()) {
            throw new RuntimeException("Insufficient truck capacity to place bid");
        }

        bid.setStatus(BidStatus.PENDING);
        bid.setSubmittedAt(LocalDateTime.now());

        return bidRepository.save(bid);
    }

    // ✅ GET BIDS BY LOAD ID
    public List<Bid> getBidsByLoad(UUID loadId) {
        return bidRepository.findByLoadId(loadId);
    }

    // ✅ REJECT BID
    public Bid rejectBid(UUID bidId) {
        Bid bid = bidRepository.findById(bidId)
                .orElseThrow(() -> new RuntimeException("Bid not found"));

        bid.setStatus(BidStatus.REJECTED);
        return bidRepository.save(bid);
    }

}
