package com.irso.proyecto_crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.irso.proyecto_crud.entity.Alumno;
import com.irso.proyecto_crud.repository.AlumnoRepository;

@Service
public class AlumnoService {
    
    @Autowired
    AlumnoRepository alumnoRepository;

    public List<Alumno> listarTodos() {
        return alumnoRepository.findAll();
    }

    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public Alumno obtenerPorId(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        alumnoRepository.deleteById(id);  
    }

}
