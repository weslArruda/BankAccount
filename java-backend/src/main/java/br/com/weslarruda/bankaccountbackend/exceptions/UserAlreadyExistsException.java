package br.com.weslarruda.bankaccountbackend.exceptions;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException() {

        super("Usuário já está cadastrado.");

    }
    
}
