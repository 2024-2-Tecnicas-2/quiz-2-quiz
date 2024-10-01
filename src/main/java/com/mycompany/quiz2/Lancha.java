/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
public class Lancha extends VehiculoBase implements Vehiculo {

    public tipoCombustible combustible;

    public Lancha(tipoCombustible combustible, String marca, String modelo, int kilometraje) {
        super(marca, modelo, kilometraje);
        this.combustible = combustible;
    }

    @Override
    public tipoCombustible tipoCombustible() {
        return combustible;
    }
    
    

}