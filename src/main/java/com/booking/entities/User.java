package com.booking.entities;

import javax.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true)
    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;

    private String city;

    private String state;

    private String country;

    private String zipCode;
}
