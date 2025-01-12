package com.usermanagement.service.implementation;

import com.usermanagement.mapper.UserMapper;
import com.usermanagement.model.dto.UserCreateDto;
import com.usermanagement.model.dto.UserResponseDto;
import com.usermanagement.model.dto.UserUpdateDto;
import com.usermanagement.model.entity.Gender;
import com.usermanagement.model.entity.Status;
import com.usermanagement.model.entity.User;
import com.usermanagement.repository.GenderRepository;
import com.usermanagement.repository.StatusRepository;
import com.usermanagement.repository.UserRepository;
import com.usermanagement.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserImplementation implements UserService {

    private final UserRepository userRepository;

    private final GenderRepository genderRepository;

    private final StatusRepository statusRepository;

    private final UserMapper userMapper;

    @Override
    public String addUser(UserCreateDto userDto) {

        Optional<Gender> gender=genderRepository.findByGender(userDto.getGender());
        Optional<Status> status=statusRepository.findByStatus(userDto.getStatus());

        User user =new User();
        if(gender.isPresent() && status.isPresent()){
            user.setGender(gender.get());
            user.setStatus(status.get());
        }

        User insertedUser=userRepository.save(userMapper.UserDtoMapToUser(userDto,user));

        if (insertedUser!=null){
            return "User created successfully";
        }

        return "Something went wrong";
    }

    @Override
    public UserResponseDto updateUser(UserUpdateDto userUpdateDto) {
        return null;
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponseDto getUserById(Integer id) {
        return null;
    }

    @Override
    public String deleteUserById(Integer id) {
        return "";
    }
}
