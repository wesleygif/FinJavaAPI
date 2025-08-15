package com.finJavaAPI.FinJavaAPI.application.port.out;

import com.finJavaAPI.FinJavaAPI.domain.entity.User;

import java.util.List;

public interface UserRepositoryPort {
    User save(User user);
    User findById(Long id);
    List<User> getAll();
}
