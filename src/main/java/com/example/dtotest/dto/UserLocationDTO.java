package com.example.dtotest.dto;

import com.example.dtotest.model.Location;
import lombok.Data;

@Data
public class UserLocationDTO {
    private Long id;
    private String username;
    private Location location;
}
