package com.usermanagement.controller;

import com.usermanagement.model.activemq.UserMessage;
import com.usermanagement.model.dto.UserCreateDto;
import com.usermanagement.model.dto.UserResponseDto;
import com.usermanagement.model.dto.UserUpdateDto;
import com.usermanagement.model.dto.UserUpdatePasswordDto;
import com.usermanagement.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController implements UsersApi{

    private final JmsTemplate jmsTemplate;

    private final UserService userService;

    @PostMapping("/publishMessage")
    public ResponseEntity<String>publishMessage(@RequestBody UserMessage userMessage){
        jmsTemplate.convertAndSend("bridge-queue",userMessage);
        return new ResponseEntity<>("Sent", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> createUser(UserCreateDto userCreateDto) {
       return new ResponseEntity<>(userService.addUser(userCreateDto),HttpStatus.OK) ;
       // return UsersApi.super.createUser(userCreateDto);
    }

    @Override
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        return UsersApi.super.getAllUsers();
    }

    @Override
    public ResponseEntity<UserResponseDto> getUserById(Integer id) {
        return UsersApi.super.getUserById(id);
    }

    @Override
    public ResponseEntity<String> updateUser(Integer id, UserUpdateDto userUpdateDto) {
        return UsersApi.super.updateUser(id, userUpdateDto);
    }

    @Override
    public ResponseEntity<String> updatePassword(Integer id, UserUpdatePasswordDto userUpdatePasswordDto) {
        return UsersApi.super.updatePassword(id, userUpdatePasswordDto);
    }
}
