package com.usermanagement.repository;

import com.usermanagement.model.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatusRepository extends JpaRepository<Status,Long> {
    Optional<Status> findByStatus(String status);
}
