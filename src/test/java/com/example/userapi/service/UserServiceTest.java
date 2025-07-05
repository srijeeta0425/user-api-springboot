package com.example.userapi.service;

import com.example.userapi.UserService;
import com.example.userapi.model.User;
import com.example.userapi.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks before each test
    }

    @Test
    public void testGetAllUsers() {
        // Arrange - mock user list
        User user1 = new User();
        user1.setEmail("john@example.com");
        user1.setFirstName("John");
        user1.setLastName("Doe");
        user1.setTenantId("tenant1");

        User user2 = new User();
        user2.setEmail("jane@example.com");
        user2.setFirstName("Jane");
        user2.setLastName("Smith");
        user2.setTenantId("tenant2");

        List<User> mockUserList = Arrays.asList(user1, user2);

        // Mock the repository call
        when(userRepository.findAll()).thenReturn(mockUserList);

        // Act
        List<User> users = userService.getAllUsers();

        // Assert
        assertEquals(2, users.size());
        assertEquals("john@example.com", users.get(0).getEmail());
        assertEquals("jane@example.com", users.get(1).getEmail());
    }
}
