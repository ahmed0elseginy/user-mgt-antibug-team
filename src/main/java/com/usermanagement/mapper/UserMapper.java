package com.usermanagement.mapper;

import com.usermanagement.model.dto.UserResponse;
import com.usermanagement.model.dto.UserUpdate;
import com.usermanagement.model.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    Creating new user object based on userDto
    @Mapping(target = "id", ignore = true)
    User UserDtoMapToUser(User userDto);

    UserResponse userEntityMapToUserResponse(UserResponse user);

//    Update aer with valn existing usues from a UserDto object.
    @Mapping(target = "fullName", ignore = true)
    @Mapping(target = "gender", ignore = true)
    UserResponse UpdateDtoMapToUser(UserUpdate userUpdateDto, @MappingTarget UserResponse user);

}
