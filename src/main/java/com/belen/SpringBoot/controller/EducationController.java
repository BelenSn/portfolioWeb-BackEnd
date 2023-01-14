

package com.belen.SpringBoot.controller;

import com.belen.SpringBoot.model.Education;
import com.belen.SpringBoot.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/educacion")
public class EducationController {
    
    @Autowired
    private final IEducationService eService;

    public EducationController(IEducationService eService) {
        this.eService = eService;
    }    
    
    //ver todos
    @GetMapping("/ver")
    @ResponseBody
    public ResponseEntity<List<Education>> getAllEducation(){
        List<Education> listE = eService.getAllEducation();
        return new ResponseEntity(listE, HttpStatus.OK);
    }
   
    //agregar
    @PostMapping("/agregar")
    public ResponseEntity<Education> addEducation(@RequestBody Education e){
       Education newE = eService.addEducation(e);
       return new ResponseEntity<> (newE,HttpStatus.CREATED);
    }  
       
    
    //editar  
    @PutMapping("/editar")
    public ResponseEntity<Education> editEducation(@RequestBody Education e){        
        Education editE = eService.editEducation(e);        
        return new ResponseEntity<>(editE, HttpStatus.OK);       
        
    }    
    
    //borrar
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable Long id){
        eService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }
}
