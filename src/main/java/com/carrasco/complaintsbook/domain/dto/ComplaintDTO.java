package com.carrasco.complaintsbook.domain.dto;

import lombok.Data;

@Data
public class ComplaintDTO {
    private int id;
    private String place;
    private String type;
    private String comment;
    private int userId;
}
