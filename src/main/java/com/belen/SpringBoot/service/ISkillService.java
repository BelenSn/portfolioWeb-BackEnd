
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public Skill addSkill(Skill s);
    
    public List<Skill> getAllSkill();
    
    public Skill editSkill(Skill s);
    
    public void deleteSkill(Long id);
    
}
