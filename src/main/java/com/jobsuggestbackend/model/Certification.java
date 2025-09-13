package com.jobsuggestbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "certification")
public class Certification {
    @Id
    @GeneratedValue
    private long Id;

    @Column(nullable = false)
    private String certificationName;

    @Column(nullable = false)
    private String certificationFile;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public String getCertificationFile() {
        return certificationFile;
    }

    public void setCertificationFile(String certificationFile) {
        this.certificationFile = certificationFile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
