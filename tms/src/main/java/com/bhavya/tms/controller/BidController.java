package com.bhavya.tms.controller;

import com.bhavya.tms.entity.Bid;
import com.bhavya.tms.service.BidService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bid")
public class BidController {

    private final BidService bidService;

    public BidController(BidService bidService) {
        this.bidService = bidService;
    }

    // ✅ POST BID
    @PostMapping
    public Bid submitBid(@RequestBody Bid bid) {
        return bidService.submitBid(bid);
    }

    // ✅ GET BIDS BY LOAD ID
    @GetMapping("/load/{loadId}")
    public List<Bid> getBidsByLoad(@PathVariable UUID loadId) {
        return bidService.getBidsByLoad(loadId);
    }

    // ✅ REJECT BID
    @PatchMapping("/{bidId}/reject")
    public Bid rejectBid(@PathVariable UUID bidId) {
        return bidService.rejectBid(bidId);
    }
}
