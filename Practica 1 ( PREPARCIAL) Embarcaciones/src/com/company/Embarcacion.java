package com.company;

public abstract class Embarcacion {
    private Capitán capitán;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double eslora;

    public Embarcacion(Capitán capitán, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora) {
        this.capitán = capitán;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Double montoAlquiler(){
        if (anioFabricacion >= 2000){
            return precioBase + valorAdicional;
        }else {
            return precioBase;
        }
    }

    public Capitán getCapitán() {
        return capitán;
    }

    public void setCapitán(Capitán capitán) {
        this.capitán = capitán;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }
}
