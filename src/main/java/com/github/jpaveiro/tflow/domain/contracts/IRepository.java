package com.github.jpaveiro.tflow.domain.contracts;

import com.github.jpaveiro.tflow.infrastructure.persistence.entities.UserEntity;

import java.util.Optional;

public interface IRepository {
    UserEntity save(UserEntity user);
    Optional<UserEntity> findById(Long id);
    void deleteById(Long id);
}
