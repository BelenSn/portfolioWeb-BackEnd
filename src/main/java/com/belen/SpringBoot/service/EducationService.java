
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Education;
import com.belen.SpringBoot.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducationService implements IEducationService{
    
    private final EducationRepository eRepository;
    
    @Autowired
    public EducationService(EducationRepository eRepository){
        this.eRepository = eRepository;
    }
    
    // metodos
    
    @Override
    public Education addEducation(Education e) {
        return eRepository.save(e);
    }
    
    @Override
    public List<Education> getAllEducation() {
        return eRepository.findAll();
    }    

    @Override
    public Education editEducation(Education e) {
        return eRepository.save(e);
    }    
       
    @Override
    public void deleteEducation(Long id) {
        eRepository.deleteById(id);
    }   
    
}
