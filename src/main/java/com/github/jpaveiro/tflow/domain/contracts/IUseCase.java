package com.github.jpaveiro.tflow.domain.contracts;

import com.github.jpaveiro.tflow.presentation.dto.IRequest;
import com.github.jpaveiro.tflow.presentation.dto.Response;

public interface IUseCase <I extends IRequest, O extends Response> {
    O run(I input);
}
