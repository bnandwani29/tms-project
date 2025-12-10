package com.bhavya.tms.service;

import com.bhavya.tms.entity.TransporterTruck;
import com.bhavya.tms.repository.TransporterTruckRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransporterTruckService {

    private final TransporterTruckRepository transporterTruckRepository;

    public TransporterTruckService(TransporterTruckRepository transporterTruckRepository) {
        this.transporterTruckRepository = transporterTruckRepository;
    }

    // ✅ Get ALL trucks
    public List<TransporterTruck> getAllTrucks() {
        return transporterTruckRepository.findAll();
    }

    // ✅ Get trucks by transporter ID
    public List<TransporterTruck> getTrucksForTransporter(UUID transporterId) {
        return transporterTruckRepository.findByTransporterId(transporterId);
    }
}
