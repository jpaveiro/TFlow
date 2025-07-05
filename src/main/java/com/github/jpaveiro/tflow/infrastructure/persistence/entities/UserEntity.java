package com.github.jpaveiro.tflow.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tb_users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(
            name = "user_id",
            updatable = false
    )
    private Long userId;

    @Column(
            name = "user_name",
            length = 60,
            nullable = false
    )
    private String userName;

    @Column(
            name = "user_email",
            length = 40,
            nullable = false,
            unique = true
    )
    private String userEmail;

    @CreatedDate
    @CreationTimestamp
    @Column(
            name = "created_at"
    )
    private LocalDateTime createdAt;

    public UserEntity(String name, String email) {
        this.userName = name;
        this.userEmail = email;
    }

    protected UserEntity() {}
}
