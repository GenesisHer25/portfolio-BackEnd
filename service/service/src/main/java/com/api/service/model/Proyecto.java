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
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) 
    private Long id; 
    private String nombreProyecto;
    private Date fechaCreacion;
    private String descripcion;
    private String link;
    private Integer idAspirante;
}
