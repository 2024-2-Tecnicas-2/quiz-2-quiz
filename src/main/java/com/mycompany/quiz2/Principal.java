    package com.mycompany.quiz2;

public class Principal {

    public static void main(String[] args) {
        // Crear instancias de Coche y Lancha
        Coche coche = new Coche(tipoCombustible.DIESEL,"mazda", "2020", 70);
        Lancha lancha = new Lancha(tipoCombustible.ELECTRICO,"Marinello", "2015",82);

        coche.acelerar();
        coche.frenar();

        lancha.acelerar();
        lancha.frenar();
        
        System.out.println("Coche: " + coche.getMarca() + " " + coche.getModelo() + "Velocidad: " + coche.getKilometraje()+ " - Tipo de combustible: " + coche.combustible);
        System.out.println("Lancha: " + lancha.getMarca() + " " + lancha.getModelo() + "Velocidad: " + lancha.getKilometraje()+  " - Tipo de combustible: " + lancha.combustible);
    }
    
}