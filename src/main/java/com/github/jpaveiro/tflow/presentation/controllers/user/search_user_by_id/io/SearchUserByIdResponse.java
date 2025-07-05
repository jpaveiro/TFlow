package com.github.jpaveiro.tflow.presentation.controllers.user.search_user_by_id.io;

import com.github.jpaveiro.tflow.infrastructure.persistence.entities.UserEntity;
import com.github.jpaveiro.tflow.presentation.dto.Response;

import java.util.List;

public class SearchUserByIdResponse extends Response {
    public SearchUserByIdResponse(Integer status, String message, List<UserEntity> data) {
        super(status, message, data);
    }

    public SearchUserByIdResponse(Integer status, String message) {
        super(status, message);
    }
}
