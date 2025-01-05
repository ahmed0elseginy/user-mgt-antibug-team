package com.usermanagement.service.implementation;

import com.usermanagement.model.dto.UserUpdate;
import com.usermanagement.model.dto.response.UserResponse;
import com.usermanagement.model.entity.User;
import com.usermanagement.service.UserService;

import java.util.List;

public class UserImplementation implements UserService {

    @Override
    public UserResponse addUser(User userDto) {
        return null;
    }

    @Override
    public UserResponse updateUser(UserUpdate userUpdateDto) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponse getUserById(Integer id) {
        return null;
    }

    @Override
    public String deleteUserById(Integer id) {
        return "";
    }
}
