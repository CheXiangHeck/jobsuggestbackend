package com.jobsuggestbackend.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID Id;

    private String username;

    private String password;

    private String email;

    private LocalDateTime deletionDate;

    private LocalDateTime creationDate;

    private LocalDateTime LastLogin;
}
