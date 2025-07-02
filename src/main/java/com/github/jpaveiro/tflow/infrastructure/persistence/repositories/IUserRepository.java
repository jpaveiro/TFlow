package com.github.jpaveiro.tflow.infrastructure.persistence.repositories;

import com.github.jpaveiro.tflow.infrastructure.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
