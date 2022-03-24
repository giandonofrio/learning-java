package com.company;

public class Velero extends Embarcacion{
    private Integer cantidadMastiles;

    public Velero(Capitán capitán, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitán, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande(){
      return cantidadMastiles>4;
    }

    public Integer getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(Integer cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }
}
