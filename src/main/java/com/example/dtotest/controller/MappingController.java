package com.example.dtotest.controller;

import com.example.dtotest.dto.UserLocationDTO;
import com.example.dtotest.service.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MappingController {
    @Autowired
    private MappingService mappingService;

    @GetMapping("/map")
    public List<UserLocationDTO> getAllUsersLocation() {
        return mappingService.getAllUsersLocation();
    }
}
