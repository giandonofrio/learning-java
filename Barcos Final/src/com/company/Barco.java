package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Carga> cargas;

    public Barco(String nombre) {
        this.nombre = nombre;
        cargas = new ArrayList<>();
    }

    public void agregarCarga(Carga carga){
        cargas.add(carga);
    }
    public void mostrarCarga(){
        for (Carga carga : cargas) {
            System.out.println(carga.toString());
        }
    }
}
