package com.pruebaBack.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pruebaBack.demo.servicio.DocenteService;
import com.pruebaBack.demo.model.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @PostMapping
    public ResponseEntity<Docente> creardocente(@RequestBody Docente docente) {
        return ResponseEntity.ok(docenteService.creardocente(docente));
    }

    @GetMapping
    public List<Docente> obtenerdocentes() {
        return docenteService.obtenerdocentes();
    }
}
