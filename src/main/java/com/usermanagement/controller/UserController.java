package com.usermanagement.controller;

import com.usermanagement.model.dto.UserCreate;
import com.usermanagement.model.dto.UserResponse;
import com.usermanagement.model.dto.UserUpdate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

public class UserController implements UsersApi{
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return UsersApi.super.getRequest();
    }

    @Override
    public ResponseEntity<UserResponse> createUser(UserCreate userCreate) {
        return UsersApi.super.createUser(userCreate);
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
    public ResponseEntity<UserResponse> updateUser(Integer id, UserUpdate userUpdate) {
        return UsersApi.super.updateUser(id, userUpdate);
    }
}
