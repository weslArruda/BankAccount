package br.com.weslarruda.bankaccountbackend.modules.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "users")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "O usuário não deve conter espaços")
    private String username;

    @Length(min = 4, max = 80)
    private String password;

    @Email(message = "O campo email deve conter um email válido")
    private String email;

    @Length(max = 11)
    private String cpf;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
