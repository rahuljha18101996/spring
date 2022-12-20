package com.demo.spring.exception;

import com.demo.spring.AppError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.UUID;


@RestControllerAdvice
public class StudentExceptionHandler {
  @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<AppError> handleException(StudentNotFoundException exception) {
      AppError appError = new AppError(
              UUID.randomUUID().toString(),
              exception.getMessage(),
              HttpStatus.INTERNAL_SERVER_ERROR
      );
      return new ResponseEntity<>(appError,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
