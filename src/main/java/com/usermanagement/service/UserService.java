package com.usermanagement.service;

import com.usermanagement.model.dto.UserUpdatePasswordDto;
import com.usermanagement.model.dto.request.UserCreateDto;
import com.usermanagement.model.dto.request.UserUpdateDto;
import com.usermanagement.model.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {

    public String addUser(UserCreateDto userDto);

    public UserResponseDto updateUser(Integer id, UserUpdateDto userUpdateDto);

    public List<UserResponseDto> getAllUsers();

    public UserResponseDto getUserById(Integer id);

    public String deleteUserById(Integer id);

    public String updatePassword(Integer id, UserUpdatePasswordDto userUpdatePasswordDto);

}
