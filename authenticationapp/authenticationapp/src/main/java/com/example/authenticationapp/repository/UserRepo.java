package com.example.authenticationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.authenticationapp.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmail(String email);

}