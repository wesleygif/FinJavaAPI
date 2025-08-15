package com.finJavaAPI.FinJavaAPI.infrastructure.repository.interfaces;

import com.finJavaAPI.FinJavaAPI.infrastructure.repository.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, UUID> {
}