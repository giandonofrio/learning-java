package com.company;

public class Test {

    public static void main(String[] args) {

        Pizza muzzarella = PizzaFactory.getInstance().crearPizza("Simple");
        muzzarella.setNombre("Muzzarella");
        muzzarella.setDescripcion("Pizza de Muzzarella");
        ((Simple)muzzarella).setPrecioBase(700d);
        ((Simple)muzzarella).setPizzaGrande(true);

        Pizza especial = PizzaFactory.getInstance().crearPizza("Simple");
        especial.setNombre("Especial");
        especial.setDescripcion("Pizza Especial");
        ((Simple)especial).setPrecioBase(850d);
        ((Simple)especial).setPizzaGrande(false);

        Pizza anana = PizzaFactory.getInstance().crearPizza("Simple");
        anana.setNombre("Anana");
        anana.setDescripcion("Pizza de Anana");
        ((Simple)anana).setPrecioBase(950d);
        ((Simple)anana).setPizzaGrande(false);

        Pizza combinada = PizzaFactory.getInstance().crearPizza("Combinada");
        combinada.setNombre("Pizza combinada loca");
        combinada.setDescripcion("Pizza Combinada");
        ((Combinada)combinada).agregarPizza(especial);
        ((Combinada)combinada).agregarPizza(anana);

        Pizzeria pizzeria = new Pizzeria("Pizza Loca");
        pizzeria.agregarPizza(muzzarella);
        pizzeria.agregarPizza(especial);
        pizzeria.agregarPizza(anana);
        pizzeria.agregarPizza(combinada);
        System.out.println("Lista Pizzas:");
        pizzeria.mostrarPizzas();

    }
}
