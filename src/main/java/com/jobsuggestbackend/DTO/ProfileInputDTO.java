package com.jobsuggestbackend.DTO;

import com.jobsuggestbackend.DTO.Profile.CertificationDTO;
import com.jobsuggestbackend.DTO.Profile.EducationDTO;
import com.jobsuggestbackend.DTO.Profile.SkillDTO;

import java.util.List;

public class ProfileInputDTO {
    private List<SkillDTO> skills;
    private List<EducationDTO> educations;
    private String resumeFile;
    private List<CertificationDTO> certifications;

    public List<SkillDTO> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillDTO> skills) {
        this.skills = skills;
    }

    public List<EducationDTO> getEducations() {
        return educations;
    }

    public void setEducations(List<EducationDTO> educations) {
        this.educations = educations;
    }

    public String getResumeFile() {
        return resumeFile;
    }

    public void setResumeFile(String resumeFile) {
        this.resumeFile = resumeFile;
    }

    public List<CertificationDTO> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<CertificationDTO> certifications) {
        this.certifications = certifications;
    }
}
