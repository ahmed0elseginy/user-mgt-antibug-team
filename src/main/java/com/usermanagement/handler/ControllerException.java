package com.usermanagement.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice    //for all Controllers
public class ControllerException {

    @org.springframework.web.bind.annotation.ExceptionHandler(BindException.class)
    public ResponseEntity<Object> handlerException(BindException ex) {
        List<String> errors = ex.getAllErrors().stream()
                .map((exception) -> exception.getDefaultMessage())
                .collect(Collectors.toList());

        HashMap<String, Object> errMap = new HashMap<>();
        errMap.put("message", "Validation failed");
        errMap.put("data", errors);

        return new ResponseEntity<>(errMap, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Object>userNotFoundHandler(UserNotFoundException ex){
        Map<String,Object> response=new HashMap<>();
        response.put("message","User not found");
        response.put("data",ex.getMessage());
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }


}
