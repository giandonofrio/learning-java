package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Servicio> servicios;

    public Empresa(String nombre) {
        this.nombre = nombre;
        servicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }
    public void mostrarServicio(){
        for (Servicio servicio : servicios){
            System.out.println(servicio.toString());
        }
    }
}
