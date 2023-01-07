
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Skill;
import com.belen.SpringBoot.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillService implements ISkillService{
    
    
    private final SkillRepository sRepository;
    
    @Autowired
    public SkillService(SkillRepository sRepository) {
        this.sRepository = sRepository;
    }
        
    //metodos
    
    @Override
    public Skill addSkill(Skill s) {
        return sRepository.save(s);
    }
    
    @Override
    public List<Skill> getAllSkill() {
        return sRepository.findAll();        
    }

    @Override
    public Skill editSkill(Skill s) {
        return sRepository.save(s);
    }
       
    @Override
    public void deleteSkill(Long id) {
        sRepository.deleteById(id);
    }
    
}
