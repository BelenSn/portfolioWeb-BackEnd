
package com.belen.SpringBoot.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Project implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProject;
    
    @Basic
    private String tituloProject;
    private String fechaProject;    
    private String descripcionProject;
    private String imagenProject;
    private String linkProject;

    public Project() {
    }

    public Project(Long idProject, String tituloProject, String fechaProject, String descripcionProject, String imagenProject, String linkProject) {
        this.idProject = idProject;
        this.tituloProject = tituloProject;
        this.fechaProject = fechaProject;
        this.descripcionProject = descripcionProject;
        this.imagenProject = imagenProject;
        this.linkProject = linkProject;
    }

      
    
    
}
