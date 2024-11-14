package com.irso.proyecto_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.irso.proyecto_crud.entity.Alumno;
import com.irso.proyecto_crud.service.AlumnoService;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoservice;

    @GetMapping
    public String listAlumnos(Model model){
        List<Alumno> alumnos = alumnoservice.findAll();
        model.addAttribute("alumnos",alumnos);
        return "alumnos/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "alumnos/form";
    }


    @PostMapping("/save")
    public String saveAlumno(@ModelAttribute("alumno") Alumno alumno) {
        alumnoservice.save(alumno);
        return "redirect:/alumnos";
    }

     @GetMapping("/delete/{id}")
    public String deleteAlumno(@PathVariable Long id) {
        alumnoservice.deleteByid(id);
        return "redirect:/alumnos";
    }

    
}

