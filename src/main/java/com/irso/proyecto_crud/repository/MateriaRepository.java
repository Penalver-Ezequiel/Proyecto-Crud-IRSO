package com.irso.proyecto_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irso.proyecto_crud.entity.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,Long> {

}
