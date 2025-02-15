package com.pruebaBack.demo.servicio;

import com.pruebaBack.demo.repository.CursoRepository;
import com.pruebaBack.demo.model.Curso;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso crearcurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> obtenercursos() {
        return cursoRepository.findAll();
    }
}