package com.pruebaBack.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pruebaBack.demo.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}