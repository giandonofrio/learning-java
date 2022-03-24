package com.company;

public class CargaFactory {
    private static CargaFactory instance;

    private CargaFactory() {
    }

    public static CargaFactory getInstance(){
        if (instance ==null){
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga crearCarga(String nombreCarga){
        switch (nombreCarga){
            case "Simple":
                return new Simple();
            case "Contenedor":
                return new Contenedor();
            default:
                return null;
        }
    }


}
