package com.jobsuggestbackend.application.DatabaseErrorLog;

import com.jobsuggestbackend.model.MongoDB.DatabaseErrorLog;
import com.jobsuggestbackend.repository.MongoDB.ErrorLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ErrorLoggerService {

    @Autowired
    private ErrorLogRepository errorLogRepository;

    /**
     * Save an error log into MongoDB.
     *
     * @param userId The ID of the user causing the error (can be null if unknown)
     * @param errorMsg The exception or error message
     * @param apiPath The API endpoint or context where the error occurred
     */
    public void saveError(UUID userId, String errorMsg, String apiPath) {
        DatabaseErrorLog log = new DatabaseErrorLog();
        log.setId(UUID.randomUUID().toString());
        if (userId != null) {
            log.setUserId(userId.toString());
        }
        log.setErrorMessage(errorMsg);
        log.setApiPath(apiPath);

        errorLogRepository.save(log);
    }
}

