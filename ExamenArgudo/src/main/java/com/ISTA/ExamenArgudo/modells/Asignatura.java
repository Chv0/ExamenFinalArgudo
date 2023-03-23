package com.ISTA.ExamenArgudo.modells;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "asignatura")
@Data
public class Asignatura {
    private Long id;

    private String name;
    private int horasPracticas;
    private  int horasAutonomas;

    private Profesor profesor;
}
