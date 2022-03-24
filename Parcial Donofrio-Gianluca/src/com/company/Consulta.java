package com.company;

public class Consulta {
    private Integer fechaConsulta;
    private String especialidad;
    private String horaYMinuto;


    public Consulta(Integer fechaConsulta, String especialidad, String horaYMinuto) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaYMinuto = horaYMinuto;
    }

    public Integer getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Integer fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHoraYMinuto() {
        return horaYMinuto;
    }

    public void setHoraYMinuto(String horaYMinuto) {
        this.horaYMinuto = horaYMinuto;
    }
}
