package com.finJavaAPI.FinJavaAPI.application.port.in;

import com.finJavaAPI.FinJavaAPI.domain.dto.user.CreateUserRequest;
import com.finJavaAPI.FinJavaAPI.domain.dto.user.UserDTO;

import java.util.List;

public interface UserServicePort {
    UserDTO createUser(CreateUserRequest request);
    List<UserDTO> listAll();
}
