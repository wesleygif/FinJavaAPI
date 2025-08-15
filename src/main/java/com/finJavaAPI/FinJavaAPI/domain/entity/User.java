package com.finJavaAPI.FinJavaAPI.domain.entity;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String name;
    private final String passwordHash;

    public User(UUID id, String name, String passwordHash) {
        this.id = id;
        this.name = name;
        this.passwordHash = passwordHash;
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
    public String getPasswordHash() { return passwordHash; }
}