
package com.belen.SpringBoot.model;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idSkill;
    
    @Basic
    private String nombreSkill;
    private int porcentajeSkill;
    private String imagenSkill;

    public Skill() {
    }

    public Skill(Long idSkill, String nombreSkill, int porcentajeSkill, String imagenSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
        this.imagenSkill = imagenSkill;
    }

    
    
}
