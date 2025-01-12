package com.usermanagement.mapper;

import com.usermanagement.model.dto.UserCreateDto;
import com.usermanagement.model.dto.UserResponseDto;
import com.usermanagement.model.dto.UserUpdateDto;
import com.usermanagement.model.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {


    @Mapping(target = "gender", ignore = true)
    @Mapping(target = "status", ignore = true)
    User UserDtoMapToUser(UserCreateDto userCreateDto, @MappingTarget User user);

    @Mapping(target = "password", ignore = true)
    UserResponseDto userMapToUserResponseDto(User user);

//    Update aer with valn existing usues from a UserDto object.
    @Mapping(target = "fullName", ignore = true)
    @Mapping(target = "gender", ignore = true)
    UserResponseDto UpdateDtoMapToUser(UserUpdateDto userUpdateDto, @MappingTarget UserResponseDto user);

}
