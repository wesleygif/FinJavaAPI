package com.finJavaAPI.FinJavaAPI.application.service;

import com.finJavaAPI.FinJavaAPI.application.port.in.UserServicePort;
import com.finJavaAPI.FinJavaAPI.application.port.out.UserRepositoryPort;
import com.finJavaAPI.FinJavaAPI.domain.dto.CreateUserRequest;
import com.finJavaAPI.FinJavaAPI.domain.dto.UserDTO;
import com.finJavaAPI.FinJavaAPI.domain.entity.User;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserService(UserRepositoryPort userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDTO createUser(CreateUserRequest request) {
        String hashed = encoder.encode(request.password());

        User newUser = new User(java.util.UUID.randomUUID(), request.name(), hashed);

        User saved = userRepo.save(newUser);

        return toDTO(newUser);
    }

    @Override
    public List<UserDTO> listAll() {
        return userRepo.getAll().stream()
                .map(this::toDTO)
                .toList();
    }



    private UserDTO toDTO(User u) {
        return new UserDTO(u.getId(), u.getName(), u.getPasswordHash());
    }
}

