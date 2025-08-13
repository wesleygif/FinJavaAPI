package com.finJavaAPI.FinJavaAPI.domain.entity;

public class User {
    private final Long id;
    private final String name;
    private final String passwordHash;

    public User(Long id, String name, String passwordHash) {
        this.id = id;
        this.name = name;
        this.passwordHash = passwordHash;
    }

    // getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getPasswordHash() { return passwordHash; }
}
