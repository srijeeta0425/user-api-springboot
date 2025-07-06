package com.example.userapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DummyTest {

    @Test
    void sampleAdditionTest() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    void stringConcatenationTest() {
        String name = "Srijeeta";
        String greeting = "Hello, " + name;
        assertEquals("Hello, Srijeeta", greeting);
    }

    @Test
    void booleanTest() {
        boolean isActive = true;
        assertTrue(isActive);
    }
}
