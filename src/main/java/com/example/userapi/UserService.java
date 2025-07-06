package com.example.userapi;

import com.example.userapi.model.User;
import com.example.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //  Create a new user
    public User createUser(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    //  Update existing user
    public Optional<User> updateUser(String id, User updatedUser) {
        return userRepository.findById(id).map(existingUser -> {
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setFirstName(updatedUser.getFirstName());
            existingUser.setLastName(updatedUser.getLastName());
            existingUser.setTenantId(updatedUser.getTenantId());
            existingUser.setUpdatedAt(LocalDateTime.now());
            return userRepository.save(existingUser);
        });
    }

    //  List all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //  Toggle active/inactive status
    public Optional<User> toggleUser(String id) {
        return userRepository.findById(id).map(user -> {
            user.setActive(!user.isActive());
            user.setUpdatedAt(LocalDateTime.now());
            return userRepository.save(user);
        });
    }
}
