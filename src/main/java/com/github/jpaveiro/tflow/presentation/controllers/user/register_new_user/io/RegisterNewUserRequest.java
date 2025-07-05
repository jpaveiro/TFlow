package com.github.jpaveiro.tflow.presentation.controllers.user.register_new_user.io;

import com.github.jpaveiro.tflow.presentation.dto.IRequest;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record RegisterNewUserRequest(
        @NotBlank @Min(6) @Max(60) String name,
        @Email String email
) implements IRequest {
}
