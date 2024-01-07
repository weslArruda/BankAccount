package br.com.weslarruda.projetopicpaybackend.modules.user.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.weslarruda.projetopicpaybackend.modules.user.UserEntity;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/user")

public class UserController {
    
    @PostMapping("/")
    public void create(@Valid @RequestBody UserEntity userEntity) {

        System.out.println("User:");
        System.out.println(userEntity.getEmail());

    }

}
