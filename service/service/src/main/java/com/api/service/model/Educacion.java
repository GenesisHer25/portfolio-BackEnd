/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author arman
 */
@Getter @Setter
@Entity
public class Educacion {
   
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)    
    private Long id; 
    private String tituloEstudiado;
    private String nombreInstituto;
    private Integer idTipoEducacion;
    private String logoInstituto;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer idAspirante; 
    
}

