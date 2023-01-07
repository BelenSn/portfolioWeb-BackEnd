
package com.belen.SpringBoot.controller;

import com.belen.SpringBoot.model.Experience;
import com.belen.SpringBoot.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/experiencia")
public class ExperienceController {
    
    @Autowired
    private final IExperienceService eService;

    public ExperienceController(IExperienceService eService) {
        this.eService = eService;
    }    
    
    //
    
    @GetMapping("/ver")
    @ResponseBody
    public ResponseEntity<List<Experience>> getAllExperience(){
       List<Experience> listE = eService.getAllExperience();
        return new ResponseEntity(listE, HttpStatus.OK);
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience e){
        Experience newE = eService.addExperience(e);
        return new ResponseEntity<> (newE,HttpStatus.CREATED);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Experience> editEducation(@RequestBody Experience e){        
        Experience editE = eService.editExperience(e);        
        return new ResponseEntity<>(editE, HttpStatus.OK);       
        
    }    
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable Long id){
        eService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
