
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
public class Education implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEducation;
    
    @Basic
    private String institucionEducation;
    private String tituloEducation;
    private String fechaEducation;
    private String imagenEducation;

    public Education() {
    }

    public Education(Long idEducation, String institucionEducation, String tituloEducation, String fechaEducation, String imagenEducation) {
        this.idEducation = idEducation;
        this.institucionEducation = institucionEducation;
        this.tituloEducation = tituloEducation;
        this.fechaEducation = fechaEducation;
        this.imagenEducation = imagenEducation;
    }
    
    
}
