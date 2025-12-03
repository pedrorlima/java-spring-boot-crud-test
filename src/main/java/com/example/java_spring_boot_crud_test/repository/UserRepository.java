package com.example.java_spring_boot_crud_test.repository;

import com.example.java_spring_boot_crud_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
