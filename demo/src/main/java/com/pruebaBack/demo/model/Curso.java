package com.pruebaBack.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "curso", nullable = false)
    private String curso;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "duracion", nullable = false)
    private int duracion;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "fecha", nullable = false)
    private String fecha;

    @ManyToOne(fetch = FetchType.EAGER) // Cambiar de LAZY a EAGER
    @JoinColumn(name = "docente_id")
    @JsonIgnoreProperties("cursos") // Para evitar recursión infinita
    private Docente docentes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Docente getDocentes() {
        return docentes;
    }

    public void setDocentes(Docente docentes) {
        this.docentes = docentes;
    }
}
