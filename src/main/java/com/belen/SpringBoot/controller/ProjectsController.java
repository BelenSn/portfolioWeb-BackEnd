
package com.belen.SpringBoot.controller;

import com.belen.SpringBoot.model.Project;
import com.belen.SpringBoot.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/proyecto")
public class ProjectsController {
    
    @Autowired
    private final IProjectService pService;
    
    public ProjectsController(IProjectService pService) {
        this.pService = pService;
    }
    
    //
    
    @GetMapping("/ver")
    @ResponseBody
    public ResponseEntity<List<Project>> getAllProject(){
        List<Project> listP = pService.getAllProject();
        return new ResponseEntity(listP, HttpStatus.OK);
        
    }
    
    @PostMapping("/agregar")
    public  ResponseEntity<Project> addProject(@RequestBody Project p){
       Project newP = pService.addProject(p);
       return new ResponseEntity<> (newP,HttpStatus.CREATED);
       
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Project> editEducation(@RequestBody Project p){        
        Project editP = pService.editProject(p);
        return new ResponseEntity<>(editP, HttpStatus.OK);       
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id){
        pService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }
    
}
