package com.jobsuggestbackend.model;

import jakarta.persistence.*;

@Entity
@Table( name = "feature" )
public class Feature {
    @Id
    @GeneratedValue
    private long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)  // Many posts -> one user
    @JoinColumn(name = "role_id", nullable = false) // Foreign key column
    private Role role;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
