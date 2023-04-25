package com.api.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) 
    private Long id; 
    private String nombreHabilidad;
    private String tipoHabilidad;
    private Integer porcentaje;
    private Integer idAspirante;
    
}
