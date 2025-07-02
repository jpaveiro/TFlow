package com.github.jpaveiro.tflow.presentation.advicers;

import com.github.jpaveiro.tflow.presentation.dto.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;

@ControllerAdvice
public class MethodArgumentNotValidExceptionAdvicer {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> handleValidationException(MethodArgumentNotValidException ex) {
        var errors = new ArrayList<>();
        var statusCode = 400;

        ex.getBindingResult()
                .getAllErrors()
                .forEach(error -> {
                    String fieldName = ((FieldError) error).getField();
                    String errorMessage = error.getDefaultMessage();
                    errors.add(fieldName + ": " + errorMessage);
        });

        return ResponseEntity
                .status(statusCode)
                .body(new ExceptionResponse(
                        statusCode,
                        "Ocorreu um erro durante a validação dos parâmetros fornecidos.",
                        errors
                ));
    }
}
