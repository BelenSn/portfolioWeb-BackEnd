
package com.belen.SpringBoot.controller;

import com.belen.SpringBoot.model.About;
import com.belen.SpringBoot.model.Project;
import org.springframework.web.bind.annotation.*;
import com.belen.SpringBoot.service.IAboutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/informacion")
public class AboutController {
    
    @Autowired
    private final IAboutService aService; 

    public AboutController(IAboutService aService) {
        this.aService = aService;
    }
            
    //metodos de los cuales solo se usaran en el proyecto → getAboutID, addAbout, editAbout
    //los demas metodos son usados en Postman
    
    //ver todos
    @GetMapping("/ver")
    @ResponseBody
    public ResponseEntity<List<About>> getAllAbout(){
        List<About> listA = aService.getAllAbout();
        return new ResponseEntity(listA, HttpStatus.OK);
        
    }    
    
    //ver segun id
    @GetMapping("/ver/{id}")
    public ResponseEntity<About> getAboutId(@PathVariable("id") Long id){        
        About a = aService.getAboutId(id);
        return new ResponseEntity<>(a, HttpStatus.OK);
       
    }
    
    @PostMapping("/agregar")
    public  ResponseEntity<About> addAbout(@RequestBody About a){
       About newA = aService.addAbout(a);
       return new ResponseEntity<> (newA,HttpStatus.CREATED);
       
    }
    
    //edita  
    @PutMapping("/editar")
    public ResponseEntity<About> editAbout(@RequestBody About a){        
        About editAbout = aService.editAbout(a);        
        return new ResponseEntity<>(editAbout, HttpStatus.OK);       
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteAbout(@PathVariable Long id){
        aService.deleteAbout(id);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }
    
}
