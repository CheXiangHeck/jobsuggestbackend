package com.jobsuggestbackend.model.MongoDB;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "ErrorLog")
public class DatabaseErrorLog {

    @Id
    private String id;

    private String userId;          // Store userId as String
    private String errorMessage;    // The error message
    private String apiPath;         // Optional: API endpoint where the error occurred
    private LocalDateTime creationDate = LocalDateTime.now(); // Automatically set when log is created

    // Constructors
    public DatabaseErrorLog() {
    }

    public DatabaseErrorLog(String userId, String errorMessage, String apiPath) {
        this.userId = userId;
        this.errorMessage = errorMessage;
        this.apiPath = apiPath;
        this.creationDate = LocalDateTime.now();
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
