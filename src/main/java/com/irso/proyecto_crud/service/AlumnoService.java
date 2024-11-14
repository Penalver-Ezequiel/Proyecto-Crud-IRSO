package com.irso.proyecto_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.irso.proyecto_crud.entity.Alumno;
import com.irso.proyecto_crud.repository.AlumnoRepository;

public class AlumnoService {
    
    @Autowired
    private AlumnoRepository alumnorepository;

    public List<Alumno> findAll(){
        return alumnorepository.findAll();
    }

    public Alumno save(Alumno alumno){
        return alumnorepository.save(alumno);
    }

    public void deleteByid(Long id){
        alumnorepository.deleteById(id);
    }
}
