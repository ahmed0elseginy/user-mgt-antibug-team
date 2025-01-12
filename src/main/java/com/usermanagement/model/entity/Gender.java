package com.usermanagement.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@NotNull
@Entity
public class Gender {

    @Id
    private Long id;
    private String gender;

}
