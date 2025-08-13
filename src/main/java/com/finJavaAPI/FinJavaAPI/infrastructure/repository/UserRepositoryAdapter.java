package com.finJavaAPI.FinJavaAPI.infrastructure.repository;

import com.finJavaAPI.FinJavaAPI.application.port.out.UserRepositoryPort;
import com.finJavaAPI.FinJavaAPI.domain.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryAdapter implements UserRepositoryPort {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }
}
