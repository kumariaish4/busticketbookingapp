package com.booking.service.impl;

import com.booking.entities.User;
import com.booking.payload.UserDTO;
import com.booking.repository.UserRepository;
import com.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository  userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user=new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setAddress(userDTO.getAddress());
        user.setCity(userDTO.getCity());
        user.setUserId(userDTO.getUserId());
        user.setCountry(userDTO.getCountry());
        user.setState(userDTO.getState());
        user.setZipCode(userDTO.getZipCode());


        MultipartFile file=userDTO.getProfileImage();
        if(file!=null && !file.isEmpty()){
            String fileName=user.getEmail()+"_"+file.getOriginalFilename();
         Path uploadDir= Paths.get("D:/booking/booking/user_profile_image");

         try{
             if(!Files.exists(uploadDir)){
                 Files.createDirectories(uploadDir);
             }
             Path targetPath=uploadDir.resolve(fileName);
             Files.copy(file.getInputStream(),targetPath, StandardCopyOption.REPLACE_EXISTING);
         }catch(IOException e){
             throw new RuntimeException("Failed to store the file: "+file.getOriginalFilename(),e);
         }
        }
        User savedUser=userRepository.save(user);

        UserDTO newUserDTO =new UserDTO();
        newUserDTO.setUserId(savedUser.getUserId());
        newUserDTO.setFirstName(userDTO.getFirstName());
        newUserDTO.setLastName(userDTO.getLastName());
        newUserDTO.setEmail(userDTO.getEmail());
        newUserDTO.setPassword(null);
        newUserDTO.setPhoneNumber(userDTO.getPhoneNumber());
        newUserDTO.setAddress(userDTO.getAddress());
        newUserDTO.setCity(userDTO.getCity());
        newUserDTO.setCountry(userDTO.getCountry());
        newUserDTO.setZipCode(userDTO.getZipCode());


        return newUserDTO;
    }
}
