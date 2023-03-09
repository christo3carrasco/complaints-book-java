package com.carrasco.complaintsbook.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "complaint")
@Data
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String place;
    private String type;
    private String comment;
    private int user;
}
