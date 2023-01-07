
package com.belen.SpringBoot.controller;

import com.belen.SpringBoot.model.Skill;
import com.belen.SpringBoot.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/habilidad")
public class SkillController {
    
    @Autowired
    private final ISkillService sService;

    public SkillController(ISkillService sService) {
        this.sService = sService;
    }
    
    //
    
    @GetMapping("/ver")
    @ResponseBody
    public ResponseEntity<List<Skill>> getAllSkill(){
        List<Skill> listS = sService.getAllSkill();
        return new ResponseEntity(listS, HttpStatus.OK);
        
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill s){
        Skill newS = sService.addSkill(s);
        return new ResponseEntity<> (newS,HttpStatus.CREATED);
        
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Skill> editSkill(@RequestBody Skill s){        
        Skill editS = sService.editSkill(s);
        return new ResponseEntity<>(editS, HttpStatus.OK);       
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable Long id){
        sService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }
    
}
