/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

/**
 *
 * @author Jhon
 */
public class Reservista extends Persona{
    
    private String libM;

    public Reservista(String libM, String ced, String nom, String ape) {
        super(ced, nom, ape);
        this.libM = libM;
    }

    public String getLibM() {
        return libM;
    }

    public void setLibM(String libM) {
        this.libM = libM;
    }
    @Override
    public String toString() {
        return "Nombre: " + super.getNom() + ", Apellido: " + super.getApe() + ", Cédula: " + super.getCed() + "Libreta militar: " + libM;
    }
}
