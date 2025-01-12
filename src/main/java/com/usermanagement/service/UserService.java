package com.usermanagement.service;

import com.usermanagement.model.dto.UserCreateDto;
import com.usermanagement.model.dto.UserResponseDto;
import com.usermanagement.model.dto.UserUpdateDto;

import java.util.List;


public interface UserService {

    public String addUser(UserCreateDto userDto);

    public UserResponseDto updateUser(UserUpdateDto userUpdateDto);

    public List<UserResponseDto> getAllUsers();

    public UserResponseDto getUserById(Integer id);

    public String deleteUserById(Integer id);

}
