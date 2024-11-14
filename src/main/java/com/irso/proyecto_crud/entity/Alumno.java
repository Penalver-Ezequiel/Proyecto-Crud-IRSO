package com.irso.proyecto_crud.entity;

import jakarta.persistence.*;

@Entity
public class Alumno {   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    private String program;
    private Boolean active;
    private Float average;
   
    public Alumno(Long id, String lastName, String name, String email, String phoneNumber, String address,
            String program, Boolean active, Float average) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.program = program;
        this.active = active;
        this.average = average;
    }

     
    public Alumno() {
        //TODO Auto-generated constructor stub
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }


    
}
