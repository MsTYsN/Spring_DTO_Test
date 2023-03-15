package com.example.dtotest.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private Long id;
    private String username;
    private double latitude;
    private double longitude;
    private String place;
}
