package com.company;

public class Test {

    public static void main(String[] args) {

        Carga carga1 = CargaFactory.getInstance().crearCarga("Simple");
        carga1.setNombreCarga("TV 32’ LCD");
        carga1.setDescripcionCarga("Carga TV");
        ((Simple)carga1).setPesoCarga(30d);
        ((Simple)carga1).setRefrigerado(false);

        Carga carga2 = CargaFactory.getInstance().crearCarga("Simple");
        carga2.setNombreCarga("Caja Medicamentos");
        carga2.setDescripcionCarga("Carga Medicamentos");
        ((Simple)carga2).setPesoCarga(2d);
        ((Simple)carga2).setRefrigerado(true);

        Carga contenedor = CargaFactory.getInstance().crearCarga("Contenedor");
        contenedor.setNombreCarga("Contenedor");
        contenedor.setDescripcionCarga("Contenedor - Cargas Simples");
        ((Contenedor)contenedor).setPesoContenedor(100d);
        ((Contenedor)contenedor).agregarCarga(carga1);
        ((Contenedor)contenedor).agregarCarga(carga2);

        Barco barco = new Barco("Titanic");
        barco.agregarCarga(carga1);
        barco.agregarCarga(carga2);
        barco.agregarCarga(contenedor);
        System.out.println("Lista Cargas:");
        barco.mostrarCarga();


    }
}
