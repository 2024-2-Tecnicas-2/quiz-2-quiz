/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
public class Coche extends VehiculoBase implements Vehiculo{

    public Coche(String marca, String modelo, int kilometraje) {
        super(marca, modelo, kilometraje);
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelerando");
        
    }

    @Override
    public void Frenar() {
        System.out.println("Frenando");
      
    }

    @Override
    public void tipoCombustible() {
       
    }

 
    
    
    
}
