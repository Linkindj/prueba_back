package com.pruebaBack.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.pruebaBack.demo.servicio.CursoService; 
import com.pruebaBack.demo.model.Curso;
import com.pruebaBack.demo.repository.CursoRepository;

@RestController
@CrossOrigin(origins = "*")
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
    
     private final CursoRepository cursoRepository;

    public CursoController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }
    @GetMapping("/filtrar")
    public List<Curso> filtrarCursos(
            @RequestParam(required = false) String curso,
            @RequestParam(required = false) Double precio,
            @RequestParam(required = false) Integer duracion) {
        return cursoRepository.filtrarCursos(curso, precio, duracion);
    }
}
