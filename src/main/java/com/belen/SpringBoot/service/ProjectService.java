
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Project;
import com.belen.SpringBoot.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProjectService implements IProjectService{

    
    private final ProjectRepository pRepository;
    
    @Autowired
    public ProjectService(ProjectRepository pRepository) {
        this.pRepository = pRepository;
    }
    
    //metodos
    
    @Override
    public Project addProject(Project p) {
        return pRepository.save(p);
    }
    
    @Override
    public List<Project> getAllProject() {
        return pRepository.findAll();
    }

    @Override
    public Project editProject(Project p) {
        return pRepository.save(p);
    }      
    
    @Override
    public void deleteProject(Long id) {
        pRepository.deleteById(id);
    }

}
