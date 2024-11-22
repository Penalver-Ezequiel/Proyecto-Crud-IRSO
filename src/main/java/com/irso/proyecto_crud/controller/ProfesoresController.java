package com.irso.proyecto_crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.irso.proyecto_crud.entity.Profesor;
import com.irso.proyecto_crud.services.ProfesorService;

@Controller
@RequestMapping("/profesores")
public class ProfesoresController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping("lista")
    public String listarProfesores(Model model) {
        List<Profesor> profesor = profesorService.listarTodos();
        model.addAttribute("profesores", profesor);
        return "profesores/lsita";
    }

    @GetMapping("/nuevo")
    public String nuevoProfesor(Model model) {
        model.addAttribute("profesor", new Profesor());
        return "profesores/form";
    }

    @PostMapping
    public String guardaProfesor(Profesor profesor) {
        profesorService.guardar(profesor);
        return "redirect:/profesores/lista";
    }

    @GetMapping("/editar/{idProfesor}")
    public String editarProfesor(@PathVariable Long idProfesor, Model model) {
        Profesor profesor = profesorService.obtenerPorId(idProfesor);
        model.addAttribute("profesor", profesor);
        return "profesor/form";
    }

    @GetMapping("/detalle/{idProfesor}")
    public String detalleProfesor(@PathVariable Long idProfesor, Model model) {
        Profesor profesor = profesorService.obtenerPorId(idProfesor);
        model.addAttribute("profesor", profesor);
        return "profesores/detalle";
    }

    @GetMapping("/eliminar/{idProfesor}")
    public String getMethodName(@PathVariable Long idProfesor) {
        profesorService.eliminar(idProfesor);
        return "redirect:/profesores/lista";
    }

}
