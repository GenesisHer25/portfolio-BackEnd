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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) 
    private Long id; 
    private String cargo;
    private String descCargo;
    private String nombreEmpresa;
    private String logoEmpresa;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer idAspirante;
   
}
