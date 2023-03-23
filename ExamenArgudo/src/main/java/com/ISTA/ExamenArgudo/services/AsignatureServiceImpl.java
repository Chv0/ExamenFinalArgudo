package com.ISTA.ExamenArgudo.services;

import com.ISTA.ExamenArgudo.modells.Asignatura;
import com.ISTA.ExamenArgudo.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AsignatureServiceImpl extends GenericServiceImpl<Asignatura, Long> implements AsignaturaService{

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Override
    public CrudRepository<Asignatura, Long> getDao() {return asignaturaRepository;}
}
