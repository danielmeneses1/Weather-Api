package com.example.demo.repository;


import com.example.demo.domain.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, String>{
    UserDetails findByName(String login);
}
