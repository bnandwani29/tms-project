package com.bhavya.tms.controller;

import com.bhavya.tms.entity.Transporter;
import com.bhavya.tms.service.TransporterService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/transporter")
public class TransporterController {

    private final TransporterService transporterService;

    public TransporterController(TransporterService transporterService) {
        this.transporterService = transporterService;
    }

    @PostMapping
    public ResponseEntity<Transporter> create(@RequestBody Transporter transporter) {
        return ResponseEntity.ok(
                transporterService.createTransporter(transporter)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transporter> get(@PathVariable UUID id) {
        return ResponseEntity.ok(
                transporterService.getTransporterById(id)
        );
    }
}
