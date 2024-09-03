/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 * La clase Persona representa una persona genérica con los atributos básicos de 
 * cédula, nombre y apellido. Esta clase sirve como una clase base para otras 
 * clases más específicas en el sistema de gestión militar.
 * 
 * @author Jhon
 * @author  Nicolas
 */
public class Persona {
    
   /** Cédula de la persona */
    private String ced;
    
    /** Nombre de la persona */
    private String nom;
    
    /** Apellido de la persona */
    private String ape;

    /**
     * Constructor de la clase Persona que inicializa los atributos cédula, 
     * nombre y apellido.
     * 
     * @param ced Cédula de la persona.
     * @param nom Nombre de la persona.
     * @param ape Apellido de la persona.
     */
    public Persona(String ced, String nom, String ape) {
        this.ced = ced;
        this.nom = nom;
        this.ape = ape;
    }

    /**
     * Obtiene la cédula de la persona.
     * 
     * @return La cédula de la persona.
     */
    public String getCed() {
        return ced;
    }

    /**
     * Establece la cédula de la persona.
     * 
     * @param ced La nueva cédula de la persona.
     */
    public void setCed(String ced) {
        this.ced = ced;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param nom El nuevo nombre de la persona.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtiene el apellido de la persona.
     * 
     * @return El apellido de la persona.
     */
    public String getApe() {
        return ape;
    }

    /**
     * Establece el apellido de la persona.
     * 
     * @param ape El nuevo apellido de la persona.
     */
    public void setApe(String ape) {
        this.ape = ape;
    }  
}
