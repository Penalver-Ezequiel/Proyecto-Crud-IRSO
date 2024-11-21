package com.irso.proyecto_crud.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMateria;

    @Column(nullable = false, length = 255)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_carrera", referencedColumnName = "idCarrera")
    private Carrera carrera;

    @ManyToOne
    @JoinColumn(name = "id_profesor", referencedColumnName = "idProfesor")
    private Profesor profesor;

}
