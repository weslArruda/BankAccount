package br.com.weslarruda.bankaccountbackend.modules.user.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.weslarruda.bankaccountbackend.modules.user.UserEntity;
import br.com.weslarruda.bankaccountbackend.modules.user.UserRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/")
    public UserEntity create(@Valid @RequestBody UserEntity userEntity) {

        return this.userRepository.save(userEntity);

    }

}
