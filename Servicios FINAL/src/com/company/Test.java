package com.company;

public class Test {

    public static void main(String[] args) {

        Servicio servicio1 = ServicioFactory.getInstance().crearServicio("Simple");
        servicio1.setNombre("Venta de aire acondicionado");
        servicio1.setDescripcion("Aire acondicionado");
        ((Simple)servicio1).setPrecio(65000.00);

        Servicio servicio2 = ServicioFactory.getInstance().crearServicio("Simple");
        servicio2.setNombre("Colocación");
        servicio2.setDescripcion("Colocacion Aire");
        ((Simple)servicio2).setPrecio(10000.00);

        Servicio combo = ServicioFactory.getInstance().crearServicio("Combo");
        combo.setNombre("Combo servicios");
        combo.setDescripcion("Combo Servicios - Simple y Combo");
        ((Combo)combo).setDescuento(0.10);

        ((Combo)combo).agregarServicio(servicio1);
        ((Combo)combo).agregarServicio(servicio2);

       Empresa dh =new Empresa("Digital");
       dh.agregarServicio(servicio1);
       dh.agregarServicio(servicio2);
       dh.agregarServicio(combo);
       System.out.println("Lista Servicios:");
       dh.mostrarServicio();
    }
}
