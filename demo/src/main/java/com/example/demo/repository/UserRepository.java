package com.example.demo.repository;

import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String>{
    UserDetails findByName(String login);
}
