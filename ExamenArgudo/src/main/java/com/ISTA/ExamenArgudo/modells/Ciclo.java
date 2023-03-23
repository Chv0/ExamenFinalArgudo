package com.ISTA.ExamenArgudo.modells;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ciclo")
@Data
public class Ciclo {
    private Long id;
    private String nombre;
    private String descripcion;
    private Carrera carrera;
}
