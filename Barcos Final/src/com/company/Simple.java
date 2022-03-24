package com.company;

public class Simple extends Carga{
    private  Double pesoCarga;
    private Boolean refrigerado;

    @Override
    public Double calcularPeso() {
        if (refrigerado){
           return pesoCarga + (pesoCarga * 0.1);
        }
        return  pesoCarga;
    }




    public Double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(Double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public Boolean getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(Boolean refrigerado) {
        this.refrigerado = refrigerado;
    }
}
