package com.company;

public abstract class Carga {
    private String nombreCarga;
    private String descripcionCarga;

public abstract Double calcularPeso();

    public String getNombreCarga() {
        return nombreCarga;
    }

    public void setNombreCarga(String nombreCarga) {
        this.nombreCarga = nombreCarga;
    }

    public String getDescripcionCarga() {
        return descripcionCarga;
    }

    public void setDescripcionCarga(String descripcionCarga) {
        this.descripcionCarga = descripcionCarga;
    }

    @Override
    public String toString() {
        return "Nombre carga: " + nombreCarga + ", peso: " + calcularPeso();
    }
}
