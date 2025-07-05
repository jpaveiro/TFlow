package com.github.jpaveiro.tflow.presentation.controllers.user.search_user_by_id;

import com.github.jpaveiro.tflow.application.usecases.user.search_user_by_id.SearchUserByIdUseCase;
import com.github.jpaveiro.tflow.presentation.controllers.user.search_user_by_id.io.SearchUserByIdRequest;
import com.github.jpaveiro.tflow.presentation.controllers.user.search_user_by_id.io.SearchUserByIdResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SearchUserByIdController {
    private final SearchUserByIdUseCase usecase;

    public SearchUserByIdController(SearchUserByIdUseCase usecase) {
        this.usecase = usecase;
    }

    @GetMapping
    public ResponseEntity<SearchUserByIdResponse> searchUserById(@RequestParam Long id) {
        var response = usecase.run(new SearchUserByIdRequest(id));
        return ResponseEntity
                .status(response.getStatus())
                .body(response);
    }
}
