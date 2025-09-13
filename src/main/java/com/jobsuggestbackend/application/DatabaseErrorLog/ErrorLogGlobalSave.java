package com.jobsuggestbackend.application.DatabaseErrorLog;

import com.jobsuggestbackend.application.User.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.UUID;

@ControllerAdvice
public class ErrorLogGlobalSave {

    @Autowired
    private ErrorLoggerService errorLoggerService;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception ex, WebRequest request) {
        // Automatically get userId from UserContext
        UUID userId = UserContext.getUserId();

        // API path for reference
        String apiPath = request.getDescription(false); // e.g., "uri=/api/users/register"

        // Save error globally
        errorLoggerService.saveError(userId, ex.getMessage(), apiPath);

        // Return generic error to client
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("An unexpected error occurred.");
    }
}

