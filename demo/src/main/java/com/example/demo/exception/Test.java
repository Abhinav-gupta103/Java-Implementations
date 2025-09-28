package com.example.demo.exception;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;

// import com.example.demo.controller.DemoController;

// a. for specific packages
// @ControllerAdvice(basePackages = "com.example.demo.components")

// b. for specific controller
// @ControllerAdvice(assignableTypes = DemoController.class)

// c. for specific annotation
// @ControllerAdvice(annotations = RestController.class)

// d. ExceptionHandler is used to handle specific exceptions thrown by controllers
@ControllerAdvice
public class Test {
    @ExceptionHandler(SQLException.class)
    public String handleSQLException() {
        return null;
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFoundException() {
        return null;
    }
}
