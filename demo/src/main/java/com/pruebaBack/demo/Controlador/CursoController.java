package com.pruebaBack.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.pruebaBack.demo.servicio.CursoService; 
import com.pruebaBack.demo.model.Curso;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<Curso> crearcurso(@RequestBody Curso curso) {
        return ResponseEntity.ok(cursoService.crearcurso(curso));
    }

    @GetMapping
    public List<Curso> obtenercursos() {
        return cursoService.obtenercursos();
    }
}
