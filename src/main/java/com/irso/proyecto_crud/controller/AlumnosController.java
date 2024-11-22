package com.irso.proyecto_crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.irso.proyecto_crud.entity.Alumno;
import com.irso.proyecto_crud.entity.Carrera;
import com.irso.proyecto_crud.services.AlumnoService;
import com.irso.proyecto_crud.services.CarreraService;

@Controller
@RequestMapping("/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private CarreraService carreraService;

    @GetMapping("lista")
    public String listarAlumnos(Model model) {
        List<Alumno> alumno = alumnoService.listarTodos();
        model.addAttribute("alumnos", alumno);
        return "alumnos/lista";
    }

    @GetMapping("/nuevo")
    public String nuevoAlumno(Model model) {
        model.addAttribute("alumno", new Alumno());
        List<Carrera> carreras = carreraService.listarTodas();
        model.addAttribute("carreras", carreras);
        return "alumnos/form";
    }

    @PostMapping
    public String guardarAlumno(Alumno alumno) {
        alumnoService.guardar(alumno);
        return "redirect:/alumnos/lista";
    }

    @GetMapping("/editar/{idAlumno}")
    public String editarAlumno(@PathVariable Long idAlumno, Model model) {
        Alumno alumno = alumnoService.obtenerPorId(idAlumno);
        List<Carrera> carreras = carreraService.listarTodas();
        model.addAttribute("alumno", alumno);
        model.addAttribute("carreras", carreras);
        return "alumno/form";
    }

    @GetMapping("/detalle/{idAlumno}")
    public String detalleAlumno(@PathVariable Long idAlumno, Model model) {
        Alumno alumno = alumnoService.obtenerPorId(idAlumno);
        model.addAttribute("alumno", alumno);
        return "alumnos/detalle";
    }

    @GetMapping("/eliminar/{idAlumno}")
    public String eliminarAlumno(@PathVariable Long idAlumno) {
        alumnoService.eliminar(idAlumno);
        return "redirect:/alumnos/lista";
    }

}
