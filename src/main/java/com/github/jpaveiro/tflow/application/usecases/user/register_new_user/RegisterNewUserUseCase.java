package com.github.jpaveiro.tflow.application.usecases.user.register_new_user;

import com.github.jpaveiro.tflow.domain.contracts.IUseCase;
import com.github.jpaveiro.tflow.infrastructure.persistence.entities.UserEntity;
import com.github.jpaveiro.tflow.infrastructure.persistence.repositories.impl.UserRepositoryImpl;
import com.github.jpaveiro.tflow.presentation.controllers.user.register_new_user.io.RegisterNewUserRequest;
import com.github.jpaveiro.tflow.presentation.controllers.user.register_new_user.io.RegisterNewUserResponse;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewUserUseCase implements IUseCase<RegisterNewUserRequest, RegisterNewUserResponse> {
    private final UserRepositoryImpl repository;

    public RegisterNewUserUseCase(UserRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public RegisterNewUserResponse run(RegisterNewUserRequest input) {
        repository.save(new UserEntity(
                input.name(),
                input.email()
        ));

        return new RegisterNewUserResponse(
                200,
                "Usuário registrado com sucesso."
        );
    }
}
