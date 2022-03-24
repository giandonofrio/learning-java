package com.company;

import org.w3c.dom.ls.LSOutput;

public abstract class Paciente {
    private Consulta consulta;
    private Integer fechaNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primeraConsulta;

    public Paciente(Consulta consulta, Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = primeraConsulta;
    }

    public Boolean evaluacionInicial(){
        if (primeraConsulta){
            return true;
        }else{
            return false;
        }
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getPrimeraConsulta() {
        return primeraConsulta;
    }

    public void setPrimeraConsulta(Boolean primeraConsulta) {
        this.primeraConsulta = primeraConsulta;
    }
}
