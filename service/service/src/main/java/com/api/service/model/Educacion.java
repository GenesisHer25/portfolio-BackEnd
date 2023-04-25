package com.api.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)    
    private Long id; 
    private String tituloEstudiado;
    private String nombreInstituto;
    private String tipoEducacion;
    private String logoInstituto;
    private Date fechaInicio;
    private Date fechaFin;
    private Long idAspirante; 
    
}
