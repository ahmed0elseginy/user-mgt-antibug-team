package com.usermanagement.controller;

import com.usermanagement.model.dto.UserUpdatePasswordDto;
import com.usermanagement.model.dto.request.UserCreateDto;
import com.usermanagement.model.dto.request.UserUpdateDto;
import com.usermanagement.model.dto.response.UserResponseDto;
import com.usermanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> updateUser(Integer id, UserUpdateDto userUpdateDto) {
        return new ResponseEntity<>(String.valueOf(userService.updateUser(id,userUpdateDto)),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserResponseDto> getUserById(Integer id) {
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> updatePassword(Integer id, UserUpdatePasswordDto userUpdatePasswordDto) {
        return new ResponseEntity<>(userService.updatePassword(id, userUpdatePasswordDto),HttpStatus.OK);
    }


    @Override
    public ResponseEntity<String> deleteUserById(Integer id) {
        return new ResponseEntity<>(userService.deleteUserById(id),HttpStatus.OK);
    }

//    @PostMapping("publishMessages")
//    public ResponseEntity<String>publishMessage(@RequestBody UserMessage userMessage){
//        jmsTemplate.convertAndSend("bridge-queue",userMessage);
//        return new ResponseEntity<>("Sent", HttpStatus.OK);
//    }

}
