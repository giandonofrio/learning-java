package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Capitán capitán1 = new Capitán("Gian", "Donofrio", "A45SA6");

        Velero velero1 = new Velero(capitán1,2000.0,1000.0, 2000,20.5,2);

        System.out.println(velero1.esGrande());



        Yate yate1 = new Yate(capitán1, 2000.0,500.0,2005,13.7,4);
        Yate yate2 = new Yate(capitán1, 6000.0,200.0,2001,13.7,4);


        System.out.println(velero1.montoAlquiler());;
        System.out.println(yate1.montoAlquiler());;
        System.out.println(yate2.montoAlquiler());;

        System.out.println(yate1.compareTo(yate2));


    }
}
