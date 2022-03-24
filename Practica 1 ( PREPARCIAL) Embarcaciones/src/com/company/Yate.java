package com.company;

public class Yate extends Embarcacion implements Comparable{
    private Integer cantidadCamarotes;

    public Yate(Capitán capitán, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitán, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
       Yate yate = (Yate)o;
       if (cantidadCamarotes > yate.cantidadCamarotes){
           return 1; // Mayor Lujo
       }
       if (cantidadCamarotes < yate.cantidadCamarotes){
           return -1; // Menos Lujo
       }
       return 0; // Mismo Lujo
    }
}
