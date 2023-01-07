
package com.belen.SpringBoot.service;

import com.belen.SpringBoot.exception.AboutNotFoundException;
import com.belen.SpringBoot.model.About;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.belen.SpringBoot.repository.AboutRepository;
import java.util.List;

@Service
@Transactional
public class AboutService implements IAboutService{
    
    private final AboutRepository aRepository;
    
    @Autowired
    public AboutService(AboutRepository aRepository){
        this.aRepository = aRepository;
    }
        
   //
    @Override
    public About addAbout(About a) {//
        return aRepository.save(a);        
    }
    
    @Override
    public List<About> getAllAbout() {
        return aRepository.findAll();
    }
    
    
    public About getAboutId(Long id) {
        return (About) aRepository.findById(id).orElseThrow(() -> new AboutNotFoundException("Usuario no encontrado"));
    }
    
    
    @Override
    public About editAbout(About a) {//
        return aRepository.save(a);        
    }
    
    @Override
    public void deleteAbout(Long id) {
        aRepository.deleteById(id);
    }
    
}
    
    
    
        
   

   

    

    

