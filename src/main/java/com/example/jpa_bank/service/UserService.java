package com.example.jpa_bank.service;

import com.example.jpa_bank.controller.dto.UserDto;
import com.example.jpa_bank.entity.UserEntity;
import com.example.jpa_bank.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;
    public String createUser(UserDto userDto)
    {
        userRepository.save(new UserEntity(userDto.getDocument(),userDto.getName(),userDto.getLast_name(),userDto.getDate_created()));
        return "An user was created";
    }
}
