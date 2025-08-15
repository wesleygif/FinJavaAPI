package com.finJavaAPI.FinJavaAPI.domain.dto.user;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String name,
        String password
) {}
