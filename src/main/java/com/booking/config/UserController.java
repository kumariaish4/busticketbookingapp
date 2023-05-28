package com.booking.config;

import com.booking.payload.UserCreateRequest;
import com.booking.payload.UserDTO;
import com.booking.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }
//http://localhost:8080/api/users/create
    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDto) {
//        UserDTO userDTO = userDto.getUserDTO();
//
//        userDTO.setProfileImage(userDto.getProfileImage());
        UserDTO createdUserDTO = userService.createUser(userDto);
        return new ResponseEntity<>(createdUserDTO, HttpStatus.CREATED);

    }
}