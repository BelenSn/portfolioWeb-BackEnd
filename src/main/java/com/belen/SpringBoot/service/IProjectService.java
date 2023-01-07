
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Project;
import java.util.List;


public interface IProjectService {
    
    public Project addProject(Project p);
    
    public List<Project> getAllProject();
    
    public Project editProject(Project p);    
       
    public void deleteProject(Long id);    
    
}
