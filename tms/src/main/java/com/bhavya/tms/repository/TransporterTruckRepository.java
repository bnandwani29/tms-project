package com.bhavya.tms.repository;

import com.bhavya.tms.entity.TransporterTruck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TransporterTruckRepository extends JpaRepository<TransporterTruck, UUID> {

    List<TransporterTruck> findByTransporterId(UUID transporterId);
}
