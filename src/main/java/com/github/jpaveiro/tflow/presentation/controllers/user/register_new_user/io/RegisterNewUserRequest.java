package com.github.jpaveiro.tflow.presentation.controllers.user.register_new_user.io;

import com.github.jpaveiro.tflow.presentation.dto.IRequest;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterNewUserRequest(
        @NotBlank String name,
        @Email String email) implements IRequest {
}
