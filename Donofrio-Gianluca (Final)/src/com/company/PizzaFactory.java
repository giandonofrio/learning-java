package com.company;

public class PizzaFactory {
    private static PizzaFactory instance;

    private PizzaFactory(){
    }

    public static PizzaFactory getInstance() {
        if (instance == null) {
            instance =new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String nombrePizza){
        switch (nombrePizza){
            case "Simple":
                return new Simple();
            case "Combinada":
                return new Combinada();
            default:
                return null;
        }
    }
}
