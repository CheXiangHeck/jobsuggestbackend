package com.jobsuggestbackend.application;

import org.springframework.stereotype.Service;
import java.lang.reflect.Field;

@Service
public class ValidationUtils {
    public Boolean areAllFieldsNull(Object obj) {
        if (obj == null) {
            return true;
        }

        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true); // Allows access to private fields
                if (field.get(obj) == null) {
                    return true; // Return false if any field is null
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error accessing fields", e);
        }

        return false; // All fields are non-null
    }
}
