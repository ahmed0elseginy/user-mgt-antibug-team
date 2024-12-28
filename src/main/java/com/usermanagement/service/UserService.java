package com.usermanagement.service;

import com.usermanagement.dto.response.UserResponse;
import com.usermanagement.model.enitity.User;

import java.util.List;

public interface UserService {
    public UserResponse addUser(User userDto);

//    public UserResponse updateUser(UserUpdate userDto);

    public List<UserResponse> getAllUsers();

    public UserResponse getUserById(Integer id);

    public String deleteUserById(Integer id);


}
