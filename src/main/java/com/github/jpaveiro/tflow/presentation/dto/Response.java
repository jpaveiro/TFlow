package com.github.jpaveiro.tflow.presentation.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public abstract class Response {
    private Integer status;
    private String message;
    private List<?> data;
    private LocalDateTime timestamp;

    public Response(Integer status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public Response(Integer status, String message, List<?> data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }
}
