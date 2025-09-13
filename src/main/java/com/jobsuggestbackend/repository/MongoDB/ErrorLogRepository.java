package com.jobsuggestbackend.repository.MongoDB;

import com.jobsuggestbackend.model.MongoDB.DatabaseErrorLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ErrorLogRepository extends MongoRepository<DatabaseErrorLog, String> {
}
