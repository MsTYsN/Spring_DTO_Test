package com.example.dtotest.service;

import com.example.dtotest.dto.UserLocationDTO;
import com.example.dtotest.model.User;
import com.example.dtotest.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MappingService {
    @Autowired
    private UserRepository userRepository;

    private ModelMapper modelMapper = new ModelMapper();

    public List<UserLocationDTO> getAllUsersLocation() {
        /*return userRepository
                .findAll()
                .stream()
                .map(this::convertDataIntoDTO)
                .collect(Collectors.toList());*/
        return userRepository
                .findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserLocationDTO.class))
                .collect(Collectors.toList());
    }

    /*private UserLocationDTO toDTO(User user) {
        UserLocationDTO dto = modelMapper.map(user, UserLocationDTO.class);
        dto.setLatitude(user.getLocation().getLatitude());
        dto.setLongitude(user.getLocation().getLongitude());
        dto.setPlace(user.getLocation().getPlace());
        return dto;
    }*/

    /*private UserLocationDTO convertDataIntoDTO(User user) {
        UserLocationDTO dto = new UserLocationDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setLatitude(user.getLocation().getLatitude());
        dto.setLongitude(user.getLocation().getLongitude());
        dto.setPlace(user.getLocation().getPlace());
        return dto;
    }*/
}
