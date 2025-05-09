package com.usermanagement.repository;

import com.usermanagement.model.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface GenderRepository extends JpaRepository<Gender,Long> {
    Optional<Gender> findByGender(String gender);
}
