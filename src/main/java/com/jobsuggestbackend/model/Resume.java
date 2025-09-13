package com.jobsuggestbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue
    private long Id;

    @Column(nullable = false)
    private String resumePath;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getResumePath() {
        return resumePath;
    }

    public void setResumePath(String resumePath) {
        this.resumePath = resumePath;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setUser(Profile profile) {
        this.profile = profile;
    }
}
