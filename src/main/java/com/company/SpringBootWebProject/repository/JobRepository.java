package com.company.SpringBootWebProject.repository;

import com.company.SpringBootWebProject.model.Jobs;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
@Getter
@Setter
@AllArgsConstructor

public class JobRepository {
    // Initialize the jobs list
    private List<Jobs> jobs = new ArrayList<>();

    // Constructor to initialize the jobs list with predefined data
    public JobRepository() {
        jobs.add(new Jobs("Java", "Java Web Developer", "Tashkent", "Active"));
        jobs.add(new Jobs("Python", "Python Web Developer", "Samarkand", "Active"));
        jobs.add(new Jobs("Mobile App", "Mobile Application Developer", "Tashkent", "Active"));
        jobs.add(new Jobs("Web App", "Web Application Developer", "Tashkent", "INACTIVE"));
    }

    // Method to get all jobs
    public List<Jobs> getAllJobs() {
        return jobs;
    }

    // Method to add a new job
    public void addJob(Jobs job) {
        jobs.add(job);
    }
}
