package br.com.weslarruda.bankaccountbackend.modules.user.controllers;


import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.weslarruda.bankaccountbackend.exceptions.UserAlreadyExistsException;
import br.com.weslarruda.bankaccountbackend.modules.user.UserEntity;
import br.com.weslarruda.bankaccountbackend.modules.user.UserRepository;
import br.com.weslarruda.bankaccountbackend.modules.user.useCases.CreateUserUseCase;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/user")

public class UserController {

   
    @Autowired
private CreateUserUseCase createUserUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody UserEntity userEntity) {
       
        try {

           var result = this.createUserUseCase.execute(userEntity);
           return ResponseEntity.ok().body(result);
           
        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }

    }

}
