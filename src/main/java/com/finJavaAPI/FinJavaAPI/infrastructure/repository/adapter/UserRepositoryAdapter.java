package com.finJavaAPI.FinJavaAPI.infrastructure.repository.adapter;

import com.finJavaAPI.FinJavaAPI.application.port.out.UserRepositoryPort;
import com.finJavaAPI.FinJavaAPI.domain.entity.User;
import com.finJavaAPI.FinJavaAPI.infrastructure.repository.UserJpaEntity;
import com.finJavaAPI.FinJavaAPI.infrastructure.repository.interfaces.UserJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;

    public UserRepositoryAdapter(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public User save(User user) {
        UserJpaEntity entity = new UserJpaEntity();
        entity.setName(user.getName());
        entity.setPasswordHash(user.getPasswordHash());
        UserJpaEntity saved = userJpaRepository.save(entity);
        return new User(saved.getId(), saved.getName(), saved.getPasswordHash());
    }

    @Override
    public User findById(Long id) {
        // Adapte para UUID conforme necessário
        return null;
    }

    @Override
    public List<User> getAll() {
        List<UserJpaEntity> entities = userJpaRepository.findAll();
        return entities.stream()
                .map(entity -> new User(entity.getId(), entity.getName(), entity.getPasswordHash()))
                .collect(Collectors.toList());
    }
}