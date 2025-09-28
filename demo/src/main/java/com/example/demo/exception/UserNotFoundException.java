package com.example.demo.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("User not found");
    }

    public UserNotFoundException(String msg) {
        super("User Not found " + msg);
    }
}
