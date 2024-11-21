package com.company.SpringBootWebProject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Jobs {
//    private int id;
    private String title;
    private String description;
    private String location;
    private String status;
//    public List<String> requirements;
}
