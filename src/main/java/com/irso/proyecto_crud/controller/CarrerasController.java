package com.irso.proyecto_crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.irso.proyecto_crud.entity.Carrera;
import com.irso.proyecto_crud.services.CarreraService;

@Controller
@RequestMapping("/carreras")
public class CarrerasController {

    @Autowired
    private CarreraService carreraService;

    @GetMapping("lista")
    public String listarCarreras(Model model) {
        List<Carrera> carreras = carreraService.listarTodas();
        model.addAttribute("carreras", carreras);
        return "carrera/lista";
    }

    @GetMapping("/nuevo")
    public String nuevaCarrera(Model model) {
        model.addAttribute("carreras", new Carrera());
        return "carrera/form";
    }

    @PostMapping
    public String guardarCarrera(Carrera carrera) {
        carreraService.guardar(carrera);
        return "redirect:/carrera/lista";
    }

    @GetMapping("/editar/{idCarrera}")
    public String editarCarrera(@PathVariable Long idCarrera, Model model) {
        Carrera carreras = carreraService.obtenerPorId(idCarrera);
        model.addAttribute("carreras", carreras);
        return "carerra/form";
    }

    @GetMapping("/detalle/{idCarrera}")
    public String detalleCarrera(@PathVariable Long idCarrera, Model model) {
        Carrera carreras = carreraService.obtenerPorId(idCarrera);
        model.addAttribute("carreras", carreras);
        return "carrera/detalle";
    }

    @GetMapping("/eliminar/{idCarrera}")
    public String eliminarCarrera(@PathVariable Long idCarrera) {
        carreraService.eliminar(idCarrera);
        return "redirect:/carrera/lista";
    }
}
