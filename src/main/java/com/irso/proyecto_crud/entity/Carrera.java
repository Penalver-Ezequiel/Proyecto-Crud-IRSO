package com.irso.proyecto_crud.entity;
import jakarta.persistence.*;

@Entity
@Table
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrera;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 255)
    private String descripcion;

    public Carrera() {
    }

    public Carrera(Long idCarrera, String nombre, String descripcion) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
