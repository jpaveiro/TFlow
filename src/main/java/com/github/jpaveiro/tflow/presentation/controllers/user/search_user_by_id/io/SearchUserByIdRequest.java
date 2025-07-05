package com.github.jpaveiro.tflow.presentation.controllers.user.search_user_by_id.io;

import com.github.jpaveiro.tflow.presentation.dto.IRequest;

public record SearchUserByIdRequest(
        Long id
) implements IRequest {
}
