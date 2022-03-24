package com.company;

import java.util.ArrayList;

import java.util.List;

public class Combinada extends Pizza {
    private List<Pizza> pizzas = new ArrayList<>();

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void agregarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        Double totalPrecio = 0.0;
        for (Pizza pizza : pizzas) {
            totalPrecio += (pizza.calcularPrecio() / 2);
        }
        return totalPrecio;
    }
}
