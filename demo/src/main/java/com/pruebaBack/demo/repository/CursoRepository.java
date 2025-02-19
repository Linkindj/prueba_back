package com.pruebaBack.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pruebaBack.demo.model.Curso;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    List<Curso> findByCursoContaining(String curso);

    List<Curso> findByPrecioLessThanEqual(double precio);

    List<Curso> findByDuracionGreaterThanEqual(int duracion);

    @Query("SELECT c FROM Curso c WHERE " +
           "(:curso IS NULL OR c.curso LIKE %:curso%) AND " +
           "(:precio IS NULL OR c.precio <= :precio) AND " +
           "(:duracion IS NULL OR c.duracion >= :duracion)")
    List<Curso> filtrarCursos(@Param("curso") String curso,
                              @Param("precio") Double precio,
                              @Param("duracion") Integer duracion);
}