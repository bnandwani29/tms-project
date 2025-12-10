package com.bhavya.tms.repository;

import com.bhavya.tms.entity.Bid;
import com.bhavya.tms.entity.enums.BidStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BidRepository extends JpaRepository<Bid, UUID> {

    List<Bid> findByLoadId(UUID loadId);

    List<Bid> findByTransporterId(UUID transporterId);

    List<Bid> findByStatus(BidStatus status);
}
