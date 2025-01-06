package com.usermanagement.controller;

import com.usermanagement.model.activemq.UserMessage;
import com.usermanagement.model.dto.UserCreate;
import com.usermanagement.model.dto.UserResponse;
import com.usermanagement.model.dto.UserUpdate;
import com.usermanagement.model.dto.UserUpdatePassword;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController implements UsersApi{

    private final JmsTemplate jmsTemplate;

    @PostMapping("/publishMessage")
    public ResponseEntity<String>publishMessage(@RequestBody UserMessage userMessage){
        jmsTemplate.convertAndSend("bridge-queue",userMessage);
        return new ResponseEntity<>("Sent", HttpStatus.OK);
    }





    @Override
    public Optional<NativeWebRequest> getRequest() {
        return UsersApi.super.getRequest();
    }

    @Override
    public ResponseEntity<String> createUser(UserCreate userCreateDto) {
        return UsersApi.super.createUser(userCreateDto);
    }

    @Override
    public ResponseEntity<String> deleteUser(Integer id) {
        return UsersApi.super.deleteUser(id);
    }

    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return UsersApi.super.getAllUsers();
    }

    @Override
    public ResponseEntity<UserResponse> getUserById(Integer id) {
        return UsersApi.super.getUserById(id);
    }

    @Override
    public ResponseEntity<String> updateUser(Integer id, UserUpdate userUpdateDto) {
        return UsersApi.super.updateUser(id, userUpdateDto);
    }

    @Override
    public ResponseEntity<String> updateUserPassword(Integer id, UserUpdatePassword userUpdatePasswordDto) {
        return UsersApi.super.updateUserPassword(id, userUpdatePasswordDto);
    }


}
