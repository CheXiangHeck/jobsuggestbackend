package com.jobsuggestbackend.repository;

import com.jobsuggestbackend.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
