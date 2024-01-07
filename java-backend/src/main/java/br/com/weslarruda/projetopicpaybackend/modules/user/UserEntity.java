package br.com.weslarruda.projetopicpaybackend.modules.user;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserEntity {
    
    private UUID id;
    private String name;

    @Pattern(regexp = "^[^\\d\\s]+$", message = "O usuário não deve conter espaços")
    private String username;

    @Length(min = 4, max = 80)
    private String password;

    @Email(message = "O campo email deve conter um email válido")
    private String email;

    @Length(max = 11)
    private String cpf;

}
