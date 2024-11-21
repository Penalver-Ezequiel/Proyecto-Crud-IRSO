package com.irso.proyecto_crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.irso.proyecto_crud.entity.Materia;
import com.irso.proyecto_crud.repository.MateriaRepository;

@Service
public class MateriaService {

    @Autowired
    MateriaRepository materiaRepository;

    public List<Materia> listarTodas() {
        return materiaRepository.findAll();
    }

    public Materia guardar(Materia materia) {
        return materiaRepository.save(materia);
    }

    public Materia obtenerPorId(Long id) {
        return materiaRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        materiaRepository.deleteById(id);
    }
}
