
package com.belen.SpringBoot.model;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAbout;
    
    @Basic
    private String nombreAbout;
    private String apellidoAbout;
    private String tituloAbout;
    private String descripcionAbout;
    private String imagenAbout;
    
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperience")
    private List<Experience> experienceList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducation")
    private List<Education> educationList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProject")
    private List<Project> projectList;

    
    public About() {
    }

    public About(Long idAbout, String nombreAbout, String apellidoAbout, String tituloAbout, String descripcionAbout, String imagenAbout) {
        this.idAbout = idAbout;
        this.nombreAbout = nombreAbout;
        this.apellidoAbout = apellidoAbout;
        this.tituloAbout = tituloAbout;
        this.descripcionAbout = descripcionAbout;
        this.imagenAbout = imagenAbout;
    }

    
        
    
}
