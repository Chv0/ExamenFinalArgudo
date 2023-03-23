package com.ISTA.ExamenArgudo.controller;

import com.ISTA.ExamenArgudo.modells.Asignatura;
import com.ISTA.ExamenArgudo.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {
    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Asignatura>> listarProductos() {
        return new ResponseEntity<>(asignaturaService.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Asignatura> crearAsignatura(
            @RequestBody Asignatura asignatura) {
        return new ResponseEntity<>(asignaturaService.save(asignatura),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Asignatura> actualizarProducto(@PathVariable Long id, @RequestBody Asignatura p) {
        Asignatura resta = asignaturaService.findById(id);
        if (resta == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                resta.setName(p.getName());
                resta.setHorasPracticas(p.getHorasPracticas());
                resta.setHorasAutonomas(p.getHorasAutonomas());
                return new ResponseEntity<>(asignaturaService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Asignatura> eliminarProducto(@PathVariable Long id) {
        asignaturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
