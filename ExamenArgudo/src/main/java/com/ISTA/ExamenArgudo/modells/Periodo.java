package com.ISTA.ExamenArgudo.modells;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "periodo")
@Data
public class Periodo {
    private Long id;
    private String periodo;
    private int year;
}
