package com.irso.proyecto_crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.irso.proyecto_crud.entity.Materia;
import com.irso.proyecto_crud.services.MateriaService;

@Controller
@RequestMapping("/materias")
public class MateriasController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("lista")
    public String listarMaterias(Model model) {
        List<Materia> materias = materiaService.listarTodas();
        model.addAttribute("materias", materias);
        return "materia/lista";
    }

    @GetMapping("/nuevo")
    public String nuevaMateria(Model model) {
        model.addAttribute("materias", new Materia());
        return "materia/form";
    }

    @PostMapping
    public String guardarMateria(Materia materia) {
        materiaService.guardar(materia);
        return "redirect:/materia/lista";
    }

    @GetMapping("/editar/{idMateria}")
    public String editarMateria(@PathVariable Long idMateria, Model model) {
        Materia materia = materiaService.obtenerPorId(idMateria);
        model.addAttribute("materia", materia);
        return "materia/form";
    }

    @GetMapping("/detalle/{idMateria}")
    public String detalleMateria(@PathVariable Long idMateria, Model model) {
        Materia materia = materiaService.obtenerPorId(idMateria);
        model.addAttribute("materia", materia);
        return "materia/detalle";
    }

    @GetMapping("/eliminar/{idMateria}")
    public String eliminarMateria(@PathVariable Long idMateria) {
        materiaService.eliminar(idMateria);
        return "redirect:/materia/lista";
    }

}
