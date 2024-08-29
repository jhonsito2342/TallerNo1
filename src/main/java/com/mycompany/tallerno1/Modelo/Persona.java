/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

/**
 *
 * @author Jhon
 */
public class Persona {
    
    private String ced;
    private String nom;
    private String ape;

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public Persona(String ced, String nom, String ape) {
        this.ced = ced;
        this.nom = nom;
        this.ape = ape;
    }
    
}
