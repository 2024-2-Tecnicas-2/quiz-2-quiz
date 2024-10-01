
package com.mycompany.quiz2;


public abstract class VehiculoBase implements Vehiculo {
    private String marca;
    private String modelo;
    private int kilometraje;

    public VehiculoBase(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
     public void acelerar() {
        kilometraje += 10; 
        System.out.println("Acelerando. Velocidad actual: " + kilometraje + " km/h");
    }

    public void frenar() {
        kilometraje -= 10; // Disminuye la velocidad en 10 unidades
        if (kilometraje < 0) {
            kilometraje = 0; // Evitar que la velocidad sea negativa
        }
        System.out.println("Frenando. Velocidad actual: " + kilometraje + " km/h");
    }

    @Override
    public String toString() {
        return "VehiculoBase{" + "marca=" + marca + ", modelo=" + modelo + ", kilometraje=" + kilometraje + '}';
    }

   
       
}
