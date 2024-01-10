package br.com.weslarruda.bankaccountbackend.modules.user;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, UUID>{

    Optional<UserEntity>findByUsernameOrEmail(String username, String email);

}