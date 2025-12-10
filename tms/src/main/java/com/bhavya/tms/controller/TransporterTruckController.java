package com.bhavya.tms.controller;

import com.bhavya.tms.entity.TransporterTruck;
import com.bhavya.tms.service.TransporterTruckService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transporter-trucks")
public class TransporterTruckController {

    private final TransporterTruckService transporterTruckService;

    public TransporterTruckController(TransporterTruckService transporterTruckService) {
        this.transporterTruckService = transporterTruckService;
    }

    // ✅ GET ALL trucks
    @GetMapping
    public ResponseEntity<List<TransporterTruck>> getAllTrucks() {
        return ResponseEntity.ok(transporterTruckService.getAllTrucks());
    }

    // ✅ GET trucks by transporter ID
    @GetMapping("/{transporterId}")
    public ResponseEntity<List<TransporterTruck>> getTrucks(@PathVariable UUID transporterId) {
        return ResponseEntity.ok(
                transporterTruckService.getTrucksForTransporter(transporterId)
        );
    }
}
