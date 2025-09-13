package com.jobsuggestbackend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue
    private long Id;

    @Column(nullable = false)
    private String EducationLevel;
    @Column(nullable = false)
    private String Program;
    @Column(nullable = false)
    private String SchoolName;
    @Column(nullable = false)
    private LocalDateTime StartDate;
    @Column(nullable = false)
    private LocalDateTime EndDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    public String getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        EducationLevel = educationLevel;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public LocalDateTime getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        StartDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        EndDate = endDate;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
