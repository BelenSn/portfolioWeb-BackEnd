
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    //agregar
    public Experience addExperience(Experience e);
    
    //mostrar todo
    public List<Experience> getAllExperience();    
    
    //editar
    public Experience editExperience(Experience e);    
   
    //borrar
    public void deleteExperience(Long id);
    
}
