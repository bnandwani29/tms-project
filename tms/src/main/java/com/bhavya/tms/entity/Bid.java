package com.bhavya.tms.entity;

import com.bhavya.tms.entity.enums.BidStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "bids")
public class Bid {

    @Id
    @GeneratedValue
    private UUID bidId;

    @Column(nullable = false)
    private UUID loadId;

    @Column(nullable = false)
    private UUID transporterId;

    @Column(nullable = false)
    private double proposedRate;

    @Column(nullable = false)
    private int trucksOffered;

    @Enumerated(EnumType.STRING)
    private BidStatus status;

    private LocalDateTime submittedAt;

    // ✅ Getters and Setters

    public UUID getBidId() {
        return bidId;
    }

    public void setBidId(UUID bidId) {
        this.bidId = bidId;
    }

    public UUID getLoadId() {
        return loadId;
    }

    public void setLoadId(UUID loadId) {
        this.loadId = loadId;
    }

    public UUID getTransporterId() {
        return transporterId;
    }

    public void setTransporterId(UUID transporterId) {
        this.transporterId = transporterId;
    }

    public double getProposedRate() {
        return proposedRate;
    }

    public void setProposedRate(double proposedRate) {
        this.proposedRate = proposedRate;
    }

    public int getTrucksOffered() {
        return trucksOffered;
    }

    public void setTrucksOffered(int trucksOffered) {
        this.trucksOffered = trucksOffered;
    }

    public BidStatus getStatus() {
        return status;
    }

    public void setStatus(BidStatus status) {
        this.status = status;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}
