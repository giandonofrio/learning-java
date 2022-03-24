package com.company;

public class ObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private Integer numeroAsociado;

    public ObraSocial(Consulta consulta, Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta, String nombreObraSocial, Integer numeroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    @Override
    public int compareTo(Object o) {
        ObraSocial obraSocial = (ObraSocial)o;
        if (numeroAsociado > obraSocial.numeroAsociado){
            return 1;
        }
        if (numeroAsociado < obraSocial.numeroAsociado){
            return -1;
        }
        return 0;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public Integer getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(Integer numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }
}
