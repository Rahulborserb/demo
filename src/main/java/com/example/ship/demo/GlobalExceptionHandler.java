package com.example.ship.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GridLimitReachedExecption.class)
    public ResponseEntity<ErrorResponse> getGridLimitException(GridLimitReachedExecption ex) {
        ErrorResponse errorResponse = new ErrorResponse("Grid limit reach", HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
