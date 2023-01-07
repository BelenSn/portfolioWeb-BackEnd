
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
public class Experience implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idExperience;
    
    @Basic
    private String nombreExperience;
    private String empresaExperience;
    private String fechaExperience;
    private String imagenExperience;
    private String descripcionExperience;

    public Experience() {
    }

    public Experience(Long idExperience, String nombreExperience, String empresaExperience, String fechaExperience, String imagenExperience, String descripcionExperience) {
        this.idExperience = idExperience;
        this.nombreExperience = nombreExperience;
        this.empresaExperience = empresaExperience;
        this.fechaExperience = fechaExperience;
        this.imagenExperience = imagenExperience;
        this.descripcionExperience = descripcionExperience;
    }
    
    
}
