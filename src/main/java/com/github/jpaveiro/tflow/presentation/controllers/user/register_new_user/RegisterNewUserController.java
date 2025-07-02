package com.github.jpaveiro.tflow.presentation.controllers.user.register_new_user;

import com.github.jpaveiro.tflow.application.usecases.user.register_new_user.RegisterNewUserUseCase;
import com.github.jpaveiro.tflow.presentation.controllers.user.register_new_user.io.RegisterNewUserRequest;
import com.github.jpaveiro.tflow.presentation.controllers.user.register_new_user.io.RegisterNewUserResponse;
import com.github.jpaveiro.tflow.presentation.dto.Response;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/registro")
public class RegisterNewUserController {
    private final RegisterNewUserUseCase usecase;

    public RegisterNewUserController(RegisterNewUserUseCase usecase) {
        this.usecase = usecase;
    }

    @PostMapping
    public ResponseEntity<Response> registerNewUser(@Valid @RequestBody RegisterNewUserRequest request) {
        var response = usecase.run(request);
        return ResponseEntity
                .status(response.getStatus())
                .body(new RegisterNewUserResponse(
                        response.getStatus(),
                        response.getMessage()));
    }
}
