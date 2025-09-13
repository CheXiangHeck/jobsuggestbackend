package com.jobsuggestbackend.repository;

import com.jobsuggestbackend.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
