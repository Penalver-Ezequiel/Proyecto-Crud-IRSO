package com.irso.proyecto_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irso.proyecto_crud.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Long> {
}
