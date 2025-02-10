package com.pruebaBack.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pruebaBack.demo.servicio.CitaService;
import com.pruebaBack.demo.model.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @PostMapping
    public ResponseEntity<Cita> crearCita(@RequestBody Cita cita) {
        return ResponseEntity.ok(citaService.crearCita(cita));
    }

    @GetMapping
    public List<Cita> obtenerCitas() {
        return citaService.obtenerCitas();
    }
}
