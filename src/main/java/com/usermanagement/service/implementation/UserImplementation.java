package com.usermanagement.service.implementation;
import com.usermanagement.handler.PasswordMismatchException;
import com.usermanagement.handler.UserNotFoundException;
import com.usermanagement.mapper.UserMapper;
import com.usermanagement.model.dto.UserUpdatePasswordDto;
import com.usermanagement.model.dto.request.UserCreateDto;
import com.usermanagement.model.dto.request.UserUpdateDto;
import com.usermanagement.model.dto.response.UserResponseDto;
import com.usermanagement.model.entity.Gender;
import com.usermanagement.model.entity.Status;
import com.usermanagement.model.entity.User;
import com.usermanagement.repository.GenderRepository;
import com.usermanagement.repository.StatusRepository;
import com.usermanagement.repository.UserRepository;
import com.usermanagement.service.UserService;
import com.usermanagement.service.security.PasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//TODO : Best practices in this Class
@RequiredArgsConstructor
@Service
public class UserImplementation implements UserService {

    private final UserRepository userRepository;

    private final GenderRepository genderRepository;

    private final StatusRepository statusRepository;

    private final UserMapper userMapper;

    private final PasswordService passwordService;

    @Override //Done
    public String addUser(UserCreateDto userDto) {
        Optional<Gender> gender = genderRepository.findByGender(userDto.getGender());
        Optional<Status> status = statusRepository.findByStatus(userDto.getStatus());

        User insertedUser = null;
        if (gender.isPresent() && status.isPresent()) {
            User user = userMapper.UserDtoMapToUser(userDto, new User());
            user.setGender(gender.get());
            user.setStatus(status.get());
            String hashedPassword = passwordService.hashPassword(userDto.getPassword());
            user.setPassword(hashedPassword);
            insertedUser = userRepository.save(user);
        }
        if (insertedUser != null) {
            return "User added successfully";
        } else {
            return "Something went wrong";
        }

    }

    @Override
    public UserResponseDto updateUser(Integer id, UserUpdateDto userUpdateDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with ID " + id + " not found."));
        userMapper.UpdateUserDtoMapToUser(userUpdateDto, user);
        // Use the existing hashPassword method for password hashing
        String hashedPassword = passwordService.hashPassword(userUpdateDto.getPassword());
        user.setPassword(hashedPassword);

        User updatedUser = userRepository.save(user);
        return userMapper.userMapToUserResponseDto(updatedUser);

//        if (existingUser.isPresent()) {
//            User user = existingUser.get();
//            userMapper.UpdateDtoMapToUser(userUpdateDto,user);
//            User updatedUser = userRepository.save(user);
//            return userMapper.userMapToUserResponseDto(updatedUser);
//        }
//        return null;
    }

    @Override
    public String updatePassword(Integer id, UserUpdatePasswordDto userUpdatePasswordDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        if (!passwordService.verifyPassword(userUpdatePasswordDto.getOldPassword(), user.getPassword())) {
            throw new PasswordMismatchException("Old password does not match");
        }
        user.setPassword(passwordService.hashPassword(userUpdatePasswordDto.getNewPassword()));
        userRepository.save(user);
        return "Password updated successfully";
        /*
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User user = existingUser.get();
            if (passwordService.verifyPassword(userUpdatePasswordDto.getOldPassword(), user.getPassword())) {
                user.setPassword(passwordService.hashPassword(userUpdatePasswordDto.getNewPassword()));
                userRepository.save(user);
                return "Password updated successfully";
            } else {
                throw new IllegalArgumentException("Old password does not match");
            }
        }
        throw new IllegalArgumentException("User not found");
*/
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::userMapToUserResponseDto)
                .collect(Collectors.toList());
    }


    @Override
    public UserResponseDto getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(userMapper::userMapToUserResponseDto).orElse(null);
    }


    @Override
    public String deleteUserById(Integer id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        }
        return "User not found";
    }

}
