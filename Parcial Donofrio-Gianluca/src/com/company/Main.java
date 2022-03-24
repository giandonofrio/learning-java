package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Consulta consulta1 = new Consulta(10/9/2021,"Traumatologia","10:09");
        Consulta consulta2 = new Consulta(04/12/2019,"Pediatria","14:50");
        Consulta consulta3 = new Consulta(06/12/2019,"Clinica Medica","14:50");

        Particular particular1 = new Particular(consulta1,10/02/2000,"Gian","DOnofrio",true,23848439,2000.0);
        System.out.println(particular1.getDni());

        ObraSocial obraSocial1 = new ObraSocial(consulta2,07/11/2000,"Homero","Simpson",false,"Osde", 3000);
        ObraSocial obraSocial2 = new ObraSocial(consulta3,12/11/2000,"Bart","Simpson",false,"Swiss Medical", 4000);
        System.out.println(obraSocial1.compareTo(obraSocial2));



    }
}
