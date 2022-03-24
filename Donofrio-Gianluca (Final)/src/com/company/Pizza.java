package com.company;

public abstract class Pizza {
    private String nombrePizza;
    private String descripcionPizza;

    public abstract Double calcularPrecio();

    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public String getDescripcionPizza() {
        return descripcionPizza;
    }

    public void setDescripcionPizza(String descripcionPizza) {
        this.descripcionPizza = descripcionPizza;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombrePizza + ", precio: $" + calcularPrecio();
    }
}
