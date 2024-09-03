/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

/**
 *
 * @author Jhon
 */
public class Aplazado extends Persona{
    
    private String dateA;

    public String getDateA() {
        return dateA;
    }

    public void setDateA(String dateA) {
        this.dateA = dateA;
    }

    public Aplazado(String dateA, String ced, String nom, String ape) {
        super(ced, nom, ape);
        this.dateA = dateA;
    }
     @Override
    public String toString() {
        return "Nombre: " + super.getNom() + ", Apellido: " + super.getApe() + ", Cédula: " + super.getCed() + ", Fecha aplzado: "+ dateA;
    }
    
}
