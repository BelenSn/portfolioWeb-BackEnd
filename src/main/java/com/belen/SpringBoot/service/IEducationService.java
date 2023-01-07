
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.Education;
import java.util.List;


public interface IEducationService {
    
    //crear 
    public Education addEducation(Education e);
    
    //mostrar - traer todo
    public List<Education> getAllEducation();      
    
    //editar 
    public Education editEducation(Education e);     
           
    //borrar 
    public void deleteEducation(Long id);
    
}
