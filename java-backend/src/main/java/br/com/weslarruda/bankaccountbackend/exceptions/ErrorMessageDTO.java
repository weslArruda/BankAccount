package br.com.weslarruda.bankaccountbackend.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO { //DTO = Data Transfer to Object

    private String message;
    private String field;
    
}
