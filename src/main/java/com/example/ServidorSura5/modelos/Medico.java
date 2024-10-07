package com.example.ServidorSura5.modelos;


import jakarta.persistence.*;

@Entity
@Table(name="medico")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres; //35 caracteres y solo letras

    private String matriculaProfesional; //20 caracteres

    private String especialidad; //20 caracteres

    private Double salario; //solo positivos, menos de 10 megas y maximo 20

    private String ips; //50 caracteres

    private String correo; //@sura.com.co

    private String telefono; //12 caracteres

    private String dirreccion; //50 caracteres

    private Boolean disponibleFindesemana;

    public Medico() {
    }

    public Medico(Long id, String nombres, String matriculaProfesional, String especialidad, Double salario, String ips, String correo, String telefono, String dirreccion, Boolean disponibleFindesemana) {
        this.id = id;
        this.nombres = nombres;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.dirreccion = dirreccion;
        this.disponibleFindesemana = disponibleFindesemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public Boolean getDisponibleFindesemana() {
        return disponibleFindesemana;
    }

    public void setDisponibleFindesemana(Boolean disponibleFindesemana) {
        this.disponibleFindesemana = disponibleFindesemana;
    }
}
