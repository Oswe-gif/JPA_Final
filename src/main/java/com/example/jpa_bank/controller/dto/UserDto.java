package com.example.jpa_bank.controller.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer document;
    private String name;
    private String lastname;
    private String dateCreated;
}
