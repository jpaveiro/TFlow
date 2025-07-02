package com.github.jpaveiro.tflow.presentation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ExceptionResponse extends Response {
    public ExceptionResponse(Integer status, String message, List<?> data) {
        super(status, message, data);
    }
}
