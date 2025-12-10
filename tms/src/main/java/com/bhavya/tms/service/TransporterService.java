package com.bhavya.tms.service;

import com.bhavya.tms.entity.Transporter;
import com.bhavya.tms.repository.TransporterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransporterService {

    private final TransporterRepository transporterRepository;

    public TransporterService(TransporterRepository transporterRepository) {
        this.transporterRepository = transporterRepository;
    }

    public Transporter createTransporter(Transporter t) {
        return transporterRepository.save(t);
    }

    public Transporter getTransporterById(UUID id) {
        return transporterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transporter not found: " + id));
    }


    public List<Transporter> getAllTransporters() {
        return transporterRepository.findAll();
    }
}
