package com.usermanagement.model.entity;


import com.usermanagement.model.enums.Statuses;
import com.usermanagement.model.enums.Genders;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@NotNull
@Entity
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String email;
    private String password;
    private String fullName;
    private String mobileNumber;
    private String role;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;


}
