package com.finJavaAPI.FinJavaAPI.domain.dto;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String name,
        String password
) {}
