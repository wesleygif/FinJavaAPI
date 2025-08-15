package com.finJavaAPI.FinJavaAPI.infrastructure.adapters;

import com.finJavaAPI.FinJavaAPI.application.port.in.UserServicePort;
import com.finJavaAPI.FinJavaAPI.domain.dto.user.CreateUserRequest;
import com.finJavaAPI.FinJavaAPI.domain.dto.user.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServicePort userService;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserRequest request) {
        UserDTO created = userService.createUser(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(created);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = userService.listAll();
        return ResponseEntity.ok(users);
    }
}
