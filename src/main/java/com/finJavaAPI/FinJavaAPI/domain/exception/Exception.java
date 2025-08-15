package com.finJavaAPI.FinJavaAPI.domain.exception;

public class Exception {
    public class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(Long id) {
            super("User with id " + id + " not found");
        }
    }

}
