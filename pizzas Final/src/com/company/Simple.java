package com.company;

public class Simple extends Pizza{
    private Double precioBase;
    private Boolean pizzaGrande;

    @Override
    public Double calcularPrecio() {
        if (pizzaGrande){
            precioBase*=2;
        }
        return precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Boolean getPizzaGrande() {
        return pizzaGrande;
    }

    public void setPizzaGrande(Boolean pizzaGrande) {
        this.pizzaGrande = pizzaGrande;
    }
}
