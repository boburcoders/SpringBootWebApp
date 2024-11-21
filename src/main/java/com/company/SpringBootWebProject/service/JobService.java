package com.company.SpringBootWebProject.service;

import com.company.SpringBootWebProject.model.Jobs;
import com.company.SpringBootWebProject.repository.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobService {
    private final JobRepository jobRepository;

    public List<Jobs> getAllJobs() {
        return this.jobRepository.getAllJobs();
    }

    public void addJob(Jobs job) {
        this.jobRepository.addJob(job);
    }
}
