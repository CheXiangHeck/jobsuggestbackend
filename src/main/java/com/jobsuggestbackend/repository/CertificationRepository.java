package com.jobsuggestbackend.repository;

import com.jobsuggestbackend.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
}
