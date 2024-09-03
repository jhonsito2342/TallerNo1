/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

/**
 *
 * @author Jhon
 */
public class Reclutado extends Persona {

    private String codR;

    public String getCodR() {
        return codR;
    }

    public void setCodR(String codR) {
        this.codR = codR;
    }

    public Reclutado(String codR, String ced, String nom, String ape) {
        super(ced, nom, ape);
        this.codR = codR;
    }
    
     @Override
    public String toString() {
        return "Nombre: " + super.getNom() + ", Apellido: " + super.getApe() + ", Cédula: " + super.getCed() + ", Codigo de Reclutado: "+ codR;
    }
    
}
