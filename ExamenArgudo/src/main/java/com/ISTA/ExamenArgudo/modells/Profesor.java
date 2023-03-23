package com.ISTA.ExamenArgudo.modells;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profesor")
@Data
public class Profesor {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private Ciclo ciclo;
}
