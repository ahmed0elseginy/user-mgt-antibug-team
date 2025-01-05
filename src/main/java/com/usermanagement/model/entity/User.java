package com.usermanagement.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String userName;

    @NotNull(message = "You must enter your email")
    @Email(message = "Your mail not valid")
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull(message = "You must enter the password")
    @Pattern(regexp = "^[A-Za-z]+\\d{2}$", message = "Password must contain letters in begin and two digits in end")
    private String password;

    @NotNull(message = "You must enter your full name")
    @Column(nullable = false)
    private String fullName;

    @NotNull(message = "You must enter your mobile number")
    @Pattern(regexp = "^\\d{11}$", message = "The phone number not correct")
    @Column(unique = true, nullable = false)
    private String mobileNumber;

    @NotNull(message = "You must enter your role")
    @Column(unique = true, nullable = false)
    private String role;

    @NotNull(message = "You must enter your gender")
    @Column(unique = true, nullable = false)
    private String gender;

/*  @NotNull(message = "You must enter your status")
  private Status status;*/
}
