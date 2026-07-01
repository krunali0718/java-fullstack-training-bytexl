package com.example.authenticationapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.authenticationapp.entity.User;
import com.example.authenticationapp.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(User user) {

        User newUser = new User();

        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(
                passwordEncoder.encode(user.getPassword())
        );

        return userRepo.save(newUser);
    }

    public List<User> getUsers() {

        return userRepo.findAll();

    }

    public String login(User user) {

        User dbUser = userRepo.findByEmail(user.getEmail());

        if (dbUser == null) {

            return "User Not Registered";

        }

        if (passwordEncoder.matches(user.getPassword(), dbUser.getPassword())) {

            return "Login Successful";

        }

        return "User Registered But Wrong Password";
    }

}