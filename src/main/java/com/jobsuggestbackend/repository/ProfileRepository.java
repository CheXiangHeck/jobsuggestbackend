package com.jobsuggestbackend.repository;

import com.jobsuggestbackend.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    @Query("SELECT p FROM profile p JOIN FETCH p.user WHERE p.user.id = :userId")
    Profile getProfileByUserId(@Param("userId") String userId);
}
