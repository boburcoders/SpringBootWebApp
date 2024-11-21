package com.company.SpringBootWebProject.controller;

import com.company.SpringBootWebProject.model.Jobs;
import com.company.SpringBootWebProject.service.JobService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Getter
@Setter
@AllArgsConstructor
//@RequestMapping(value = "home")
public class HomeController {
    private final JobService jobService;

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/addJob")
    public String addJob() {
        return "addjob";
    }

    @GetMapping(value = "/viewAllJob")
    public String viewAllJobs(Model model) {
        model.addAttribute("jobs", this.jobService.getAllJobs());
        System.out.println(jobService.getAllJobs());
        return "views-all-job";
    }

    @PostMapping(value = "/handleForm")
    public String handleForm(Jobs jobPost, Model model) {
        model.addAttribute("jobPost", jobPost);
        this.jobService.addJob(jobPost);
        return "success";
    }

}
