package com.company;

public class Test {

    public static void main(String[] args) {

        Pizza pizzaMuzzarella = PizzaFactory.getInstance().crearPizza("Simple");
        pizzaMuzzarella.setNombrePizza("Pizza Muzzarella");
        pizzaMuzzarella.setDescripcionPizza("Pizza chica de Muzzarella");
        ((Simple)pizzaMuzzarella).setPizzaGrande(false);
        ((Simple)pizzaMuzzarella).setPrecioBase(700.00);

        Pizza pizzaEspecial = PizzaFactory.getInstance().crearPizza("Simple");
        pizzaEspecial.setNombrePizza("Pizza Especial");
        pizzaEspecial.setDescripcionPizza("Pizza chica Especial");
        ((Simple)pizzaEspecial).setPizzaGrande(false);
        ((Simple)pizzaEspecial).setPrecioBase(850.00);

        Pizza pizzaAnana = PizzaFactory.getInstance().crearPizza("Simple");
        pizzaAnana.setNombrePizza("Pizza Anana");
        pizzaAnana.setDescripcionPizza("Pizza chica de Anana");
        ((Simple)pizzaAnana).setPizzaGrande(false);
        ((Simple)pizzaAnana).setPrecioBase(950.00);

        Pizza pizzaCombinada = PizzaFactory.getInstance().crearPizza("Combinada");
        pizzaCombinada.setNombrePizza("Pizza Combinada Loca");
        pizzaCombinada.setDescripcionPizza("Pizza Combinada (Mitad Especial y Mitad Anana)");
        ((Combinada)pizzaCombinada).agregarPizza(pizzaEspecial);
        ((Combinada)pizzaCombinada).agregarPizza(pizzaAnana);


        Pizzeria pizzeria = new Pizzeria("Pizza Loca");
        pizzeria.agregarPizza(pizzaMuzzarella);
        pizzeria.agregarPizza(pizzaEspecial);
        pizzeria.agregarPizza(pizzaAnana);
        pizzeria.agregarPizza(pizzaCombinada);
        System.out.println("Listas de Pizzas disponibles: ");
        pizzeria.mostrarPizzas();

    }
}
