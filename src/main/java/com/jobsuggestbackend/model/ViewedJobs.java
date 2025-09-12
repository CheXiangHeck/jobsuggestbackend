package com.jobsuggestbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "viewedJobs")
public class ViewedJobs {
    @Id
    @GeneratedValue
    private long Id;
}
