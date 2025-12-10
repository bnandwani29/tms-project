package com.bhavya.tms.repository;

import com.bhavya.tms.entity.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransporterRepository extends JpaRepository<Transporter, UUID> {
}
