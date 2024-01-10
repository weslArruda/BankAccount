package br.com.weslarruda.bankaccountbackend.modules.user.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.weslarruda.bankaccountbackend.exceptions.UserAlreadyExistsException;
import br.com.weslarruda.bankaccountbackend.modules.user.UserEntity;
import br.com.weslarruda.bankaccountbackend.modules.user.UserRepository;

@Service
public class CreateUserUseCase {

    @Autowired
    private UserRepository userRepository;

    public UserEntity execute(UserEntity userEntity) {
        
        this.userRepository.findByUsernameOrEmail(userEntity.getUsername(), userEntity.getEmail()).ifPresent((user) -> {
            
            throw new UserAlreadyExistsException();
        });

        
        return this.userRepository.save(userEntity);

    }
    
}
