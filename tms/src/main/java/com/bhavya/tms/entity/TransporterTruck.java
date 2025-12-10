package com.bhavya.tms.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class TransporterTruck {

    @Id
    @GeneratedValue
    private UUID id;

    private String truckType;

    private int totalCount;
    private int availableCount;

    @Column(nullable = false)
    private UUID transporterId;   // ✅ ONLY UUID — NO RELATION

    // ✅ Getters & Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTruckType() { return truckType; }
    public void setTruckType(String truckType) { this.truckType = truckType; }

    public int getTotalCount() { return totalCount; }
    public void setTotalCount(int totalCount) { this.totalCount = totalCount; }

    public int getAvailableCount() { return availableCount; }
    public void setAvailableCount(int availableCount) { this.availableCount = availableCount; }

    public UUID getTransporterId() { return transporterId; }
    public void setTransporterId(UUID transporterId) { this.transporterId = transporterId; }
}
