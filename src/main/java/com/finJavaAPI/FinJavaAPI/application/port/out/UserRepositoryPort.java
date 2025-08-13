package com.finJavaAPI.FinJavaAPI.application.port.out;

import com.finJavaAPI.FinJavaAPI.domain.dto.UserDTO;
import com.finJavaAPI.FinJavaAPI.domain.entity.User;

public interface UserRepositoryPort {
    User save(User user);
    User findById(Long id);

}
