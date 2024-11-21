package com.irso.proyecto_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irso.proyecto_crud.entity.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,Long> {

}
