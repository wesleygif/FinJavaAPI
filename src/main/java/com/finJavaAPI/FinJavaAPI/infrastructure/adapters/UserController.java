package com.finJavaAPI.FinJavaAPI.infrastructure.adapters;

import com.finJavaAPI.FinJavaAPI.application.port.in.UserServicePort;
import com.finJavaAPI.FinJavaAPI.domain.dto.CreateUserRequest;
import com.finJavaAPI.FinJavaAPI.domain.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServicePort userService;

    public UserController(UserServicePort userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserRequest request) {
        UserDTO created = userService.createUser(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(created);
    }
}
