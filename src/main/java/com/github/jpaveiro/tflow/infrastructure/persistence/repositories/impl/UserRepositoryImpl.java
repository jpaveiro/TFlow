package com.github.jpaveiro.tflow.infrastructure.persistence.repositories.impl;

import com.github.jpaveiro.tflow.domain.contracts.IRepository;
import com.github.jpaveiro.tflow.infrastructure.persistence.entities.UserEntity;
import com.github.jpaveiro.tflow.infrastructure.persistence.repositories.IUserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements IRepository {
    private final IUserRepository abs;

    public UserRepositoryImpl(IUserRepository abs) {
        this.abs = abs;
    }

    @Override
    public UserEntity save(UserEntity user) {
        return abs.save(user);
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return abs.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        abs.deleteById(id);
    }
}
