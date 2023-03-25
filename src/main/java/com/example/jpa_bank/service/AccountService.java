package com.example.jpa_bank.service;

import com.example.jpa_bank.controller.dto.AccountDto;
import com.example.jpa_bank.entity.AccountEntity;
import com.example.jpa_bank.repository.AccountRepository;
import com.example.jpa_bank.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountService {
    AccountRepository accountRepository;
    UserRepository userRepository;
    public String insertAccount(AccountDto accountDto)
    {

        if(this.userRepository.existsById(accountDto.getUser()))
        {
            accountRepository.save(new AccountEntity(accountDto.getId(),accountDto.getType(),accountDto.getMoney(),accountDto.getDate_created(),accountDto.getUser()));
            return "The account was created";
        }
        else
        {
            return "Failed to create a account";
        }
    }

}