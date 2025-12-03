package com.example.java_spring_boot_crud_test.service;

import com.example.java_spring_boot_crud_test.model.User;
import com.example.java_spring_boot_crud_test.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // C
    public User createUser(User user) {
        return userRepository.save(user);
    }
    // R
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // U
    public User updateUser(Long id, User userDetails) {
        return userRepository.findById(id).map(user -> {
                user.setName(userDetails.getName());
                user.setEmail(userDetails.getEmail());
                return userRepository.save(user);
            }
        ).orElse(null);
    }

    // D
    public boolean deleteUser(Long id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
