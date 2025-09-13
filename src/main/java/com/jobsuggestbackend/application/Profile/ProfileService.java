package com.jobsuggestbackend.application.Profile;

import com.jobsuggestbackend.DTO.ProfileInputDTO;
import com.jobsuggestbackend.repository.CertificationRepository;
import com.jobsuggestbackend.repository.EducationRepository;
import com.jobsuggestbackend.repository.ProfileRepository;
import com.jobsuggestbackend.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private ResumeRepository resumeRepository;

    @Autowired
    private CertificationRepository certificationRepository;

    @Autowired
    private EducationRepository educationRepository;

    public String ProfileTaskAssigner(ProfileInputDTO profileInputDTO) {
        return "";
    }
}
