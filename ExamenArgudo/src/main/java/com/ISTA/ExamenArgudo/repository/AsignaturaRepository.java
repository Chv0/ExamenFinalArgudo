package com.ISTA.ExamenArgudo.repository;

import com.ISTA.ExamenArgudo.modells.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends MongoRepository<Asignatura, Long> {
}
