package com.irso.proyecto_crud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.irso.proyecto_crud.entity.Carrera;
import com.irso.proyecto_crud.repository.CarreraRepository;


@Service
public class CarreraService {
    
    @Autowired
    private CarreraRepository carreraRepository;

    public List<Carrera> listarTodas() {
        return carreraRepository.findAll();
    }

    public Carrera guardar(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public Carrera obtenerPorId(Long id) {
        return carreraRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        carreraRepository.deleteById(id);
    }

}
