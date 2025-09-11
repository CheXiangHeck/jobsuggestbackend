package com.jobsuggestbackend.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name    = "UUID",
            strategy = "org.hibernate.annotations.GenericGeenrator"
    )
    private UUID Id;
    private String rolesName;
    private String description;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
