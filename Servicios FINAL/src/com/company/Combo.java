package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicio{
    private Double descuento;
    private List<Servicio> servicios = new ArrayList<>();

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
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
    @Override
    public Double calcularPrecio() {
        Double total = 0.0;
        for (Servicio servicio : servicios) {
           total += servicio.calcularPrecio();
        }
        return total - (total*descuento);
    }


}
