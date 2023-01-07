
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Experience;
import com.belen.SpringBoot.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienceService implements IExperienceService{
    
    private final ExperienceRepository eRepository;
    
    @Autowired
    public ExperienceService(ExperienceRepository eRepository) {
        this.eRepository = eRepository;
    }
    
    // metodos
    
    @Override
    public Experience addExperience(Experience e) {
        return eRepository.save(e);    
    }
    
    @Override
    public List<Experience> getAllExperience() {
        return eRepository.findAll();
    }    

    @Override
    public Experience editExperience(Experience e) {
        return eRepository.save(e);
    }
    
    @Override
    public void deleteExperience(Long id) {
        eRepository.deleteById(id);
    }   
    
}
