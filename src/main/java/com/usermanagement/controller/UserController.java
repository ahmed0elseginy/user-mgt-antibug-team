package com.usermanagement.controller;

import com.usermanagement.model.dto.*;
import com.usermanagement.model.dto.PublishMessageDto;
import com.usermanagement.model.dto.UserCreateDto;
import com.usermanagement.model.dto.UserResponseDto;
import com.usermanagement.model.dto.UserUpdatePasswordDto;
import com.usermanagement.model.dto.UserUpdateDto;
import com.usermanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController implements UsersApi {

    private final UserService userService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return UsersApi.super.getRequest();
    }

    @Override
    public ResponseEntity<String> createUser(UserCreateDto userCreateDto) {
        return new ResponseEntity<>(userService.addUser(userCreateDto),HttpStatus.OK);
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
    public ResponseEntity<String> updatePassword(Integer id, UserUpdatePasswordDto userUpdatePasswordDto) {
        return UsersApi.super.updatePassword(id, userUpdatePasswordDto);
    }

    @Override
    public ResponseEntity<String> updateUser(Integer id, UserUpdateDto userUpdateDto) {
        return UsersApi.super.updateUser(id, userUpdateDto);
    }

//    @PostMapping("publishMessages")
//    public ResponseEntity<String>publishMessage(@RequestBody UserMessage userMessage){
//        jmsTemplate.convertAndSend("bridge-queue",userMessage);
//        return new ResponseEntity<>("Sent", HttpStatus.OK);
//    }

}
