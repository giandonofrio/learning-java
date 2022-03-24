package com.company;

public class Particular extends Paciente{
    private Integer dni;
    private Double cobroConsulta;

    public Particular(Consulta consulta, Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta, Integer dni, Double cobroConsulta) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraConsulta);
        this.dni = dni;
        this.cobroConsulta = cobroConsulta;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getCobroConsulta() {
        return cobroConsulta;
    }

    public void setCobroConsulta(Double cobroConsulta) {
        this.cobroConsulta = cobroConsulta;
    }
}
