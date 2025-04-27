package com.usermanagement.mapper;

import com.usermanagement.model.dto.request.UserCreateDto;
import com.usermanagement.model.dto.request.UserUpdateDto;
import com.usermanagement.model.dto.response.UserResponseDto;
import com.usermanagement.model.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "gender", ignore = true)
    @Mapping(target = "status", ignore = true)
    User UserDtoMapToUser(UserCreateDto userCreateDto, @MappingTarget User user);

//    @Mapping(target = "gender", ignore = true)
//    @Mapping(target = "status", ignore = true)

    /// /    @Mapping(target = "password", ignore = true)
//    UserResponseDto userMapToUserResponseDto(User user);
    @Mapping(source = "gender.gender", target = "gender")
    @Mapping(source = "status.status", target = "status")
    UserResponseDto userMapToUserResponseDto(User user);


    //TODO best practices here
    //Update aer with vlan existing uses from a UserDto object.
    @Mapping(target = "gender", ignore = true)
    @Mapping(target = "status", ignore = true)
    User UpdateUserDtoMapToUser(UserUpdateDto userUpdateDto, @MappingTarget User user);
}
