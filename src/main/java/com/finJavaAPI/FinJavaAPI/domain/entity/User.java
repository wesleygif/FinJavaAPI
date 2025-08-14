package com.finJavaAPI.FinJavaAPI.domain.entity;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String name;
    private final String passwordHash;

    public User(String name, String passwordHash) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.passwordHash = passwordHash;
    }

    // getters
    public UUID getId() { return id; }
    public String getName() { return name; }
    public String getPasswordHash() { return passwordHash; }


}
