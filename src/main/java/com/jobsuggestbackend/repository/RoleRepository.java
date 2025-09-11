package com.jobsuggestbackend.repository;

import com.jobsuggestbackend.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Roles, UUID> {
}
