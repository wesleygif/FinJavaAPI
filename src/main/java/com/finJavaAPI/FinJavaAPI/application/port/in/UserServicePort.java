package com.finJavaAPI.FinJavaAPI.application.port.in;

import com.finJavaAPI.FinJavaAPI.domain.dto.CreateUserRequest;
import com.finJavaAPI.FinJavaAPI.domain.dto.UserDTO;

public interface UserServicePort {
    UserDTO createUser(CreateUserRequest request);
}
