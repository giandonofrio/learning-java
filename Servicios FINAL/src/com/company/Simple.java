package com.company;

public class Simple extends Servicio{
    private Double precio;

    @Override
    public Double calcularPrecio() {
        if (getNombre().equals("Colocación")){
            return precio + (precio * 0.1);
        }
        return precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
