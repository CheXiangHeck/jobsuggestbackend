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
}
