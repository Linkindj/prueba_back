package com.pruebaBack.demo.servicio;

import com.pruebaBack.demo.repository.DocenteRepository;
import com.pruebaBack.demo.model.Docente;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public Docente creardocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public List<Docente> obtenerdocentes() {
        return docenteRepository.findAll();
    }
}