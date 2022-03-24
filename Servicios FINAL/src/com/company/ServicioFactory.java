package com.company;

public class ServicioFactory{
    private static  ServicioFactory instance;

    private ServicioFactory(){
    }

    public static ServicioFactory getInstance() {
        if (instance == null){
        instance = new ServicioFactory();
    }
        return instance;
    }

    public Servicio crearServicio(String nombreServicio){
        switch (nombreServicio){
            case "Simple":
                return new Simple();
            case "Combo":
                return new Combo();
            default:
                return null;
        }
    }

}
