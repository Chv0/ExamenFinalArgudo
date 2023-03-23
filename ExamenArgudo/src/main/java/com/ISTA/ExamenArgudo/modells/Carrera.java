package com.ISTA.ExamenArgudo.modells;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carrera")
@Data
public class Carrera {
    private Long id;
    private String nombre;
    private String descripcion;
    private Periodo periodo;
}
