package com.bhavya.tms.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transporter {

    @Id
    @GeneratedValue
    private UUID id;

    private String companyName;
    private double rating;

}
