package com.example.registrationandlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.registrationandlogin.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);
}
