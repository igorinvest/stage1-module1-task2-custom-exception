package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(Long id) {
        super("Could not find student with ID " + id);
    }
}
