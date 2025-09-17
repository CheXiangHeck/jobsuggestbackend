package com.jobsuggestbackend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String skills;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Education> educations;

    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    private Resume resume;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Certification> certifications;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public List<Certification> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certification> certifications) {
        this.certifications = certifications;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
