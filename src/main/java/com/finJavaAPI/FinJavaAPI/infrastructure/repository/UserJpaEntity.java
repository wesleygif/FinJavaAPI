package com.finJavaAPI.FinJavaAPI.infrastructure.repository;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

public class UserJpaEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private Long password;

    public UUID getId() {
        return id;
    }

    public Long getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(Long password) {
        this.password = password;
    }
}
