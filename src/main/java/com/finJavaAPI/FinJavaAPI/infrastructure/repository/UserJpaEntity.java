package com.finJavaAPI.FinJavaAPI.infrastructure.repository;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class UserJpaEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "CHAR(36)")
    private UUID id;

    private String name;

    private String passwordHash;

}
