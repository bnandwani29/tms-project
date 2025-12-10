package com.bhavya.tms.dto;

import com.bhavya.tms.entity.enums.TruckType;

public class TruckCountDto {

    private TruckType truckType;
    private int totalCount;
    private int availableCount;

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }
}
