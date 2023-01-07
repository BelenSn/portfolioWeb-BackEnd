
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.model.About;
import java.util.List;


public interface IAboutService {
    
    //crear
    public About addAbout(About a); //
    
    //ver todos
    public List<About> getAllAbout();
    
    //ver segun id
    public About getAboutId(Long id);//
    
    //editar
    public About editAbout(About a);//
    
    //borrar
    public void deleteAbout(Long id);
   
}
