package com.github.jpaveiro.tflow.application.usecases.user.search_user_by_id;

import com.github.jpaveiro.tflow.domain.contracts.IUseCase;
import com.github.jpaveiro.tflow.infrastructure.persistence.repositories.impl.UserRepositoryImpl;
import com.github.jpaveiro.tflow.presentation.controllers.user.search_user_by_id.io.SearchUserByIdRequest;
import com.github.jpaveiro.tflow.presentation.controllers.user.search_user_by_id.io.SearchUserByIdResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchUserByIdUseCase implements IUseCase<SearchUserByIdRequest, SearchUserByIdResponse> {
    private final UserRepositoryImpl repository;

    public SearchUserByIdUseCase(UserRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public SearchUserByIdResponse run(SearchUserByIdRequest input) {
        var user = repository.findById(input.id());
        return user.map(userEntity -> new SearchUserByIdResponse(
                200,
                "Usuário encontrado.",
                List.of(userEntity)
        )).orElseGet(() -> new SearchUserByIdResponse(
                404,
                "Usuário não encontrado."
        ));

    }
}
