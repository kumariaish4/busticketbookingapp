package com.booking.payload;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long userId;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    @NotBlank(message = "First name cannot be blank")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    private String lastName;

    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?\\d{10}$", message = "Phone number should be valid")
    private String phoneNumber;

    private String address;

    private String city;

    private String state;

    private String country;

    @Pattern(regexp = "^[1-9][0-9]{5}$", message = "Zip code should be valid")
    private String zipCode;
    private String profilePicture;
    private MultipartFile profileImage;
}
