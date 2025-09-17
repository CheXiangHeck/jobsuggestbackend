package com.jobsuggestbackend.model;

import com.jobsuggestbackend.model.Enum.RoleEnum;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;
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

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    private LocalDateTime deletionDate;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime creationDate = LocalDateTime.now();

    private LocalDateTime LastLogin;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleEnum systemRole = RoleEnum.USER;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Profile profile;

    public User() {};

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    };

    public User(String username, String password, String email, RoleEnum systemRole) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.systemRole = systemRole;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDeletionDate() {
        return deletionDate;
    }

    public void setDeletionDate(LocalDateTime deletionDate) {
        this.deletionDate = deletionDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastLogin() {
        return LastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        LastLogin = lastLogin;
    }

    public RoleEnum getSystemRole() {
        return systemRole;
    }

    public void setSystemRole(RoleEnum systemRole) {
        this.systemRole = systemRole;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
