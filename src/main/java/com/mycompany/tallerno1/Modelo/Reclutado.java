/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

/**
 * La clase Reclutado representa a una persona que ha sido reclutada para el servicio militar.
 * Hereda de la clase Persona y añade un atributo específico para el código de reclutamiento.
 * Esta clase es parte del sistema de gestión militar.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class Reclutado extends Persona {
    
    /** Código de reclutamiento del reclutado */
    private String codR;

    /**
     * Constructor de la clase Reclutado que inicializa los atributos heredados de Persona
     * y el atributo específico de Reclutado.
     * 
     * @param codR Código de reclutamiento del reclutado.
     * @param ced Cédula de la persona.
     * @param nom Nombre de la persona.
     * @param ape Apellido de la persona.
     */
    public Reclutado(String codR, String ced, String nom, String ape) {
        super(ced, nom, ape);
        this.codR = codR;
    }

    /**
     * Obtiene el código de reclutamiento del reclutado.
     * 
     * @return El código de reclutamiento.
     */
    public String getCodR() {
        return codR;
    }

    /**
     * Establece el código de reclutamiento del reclutado.
     * 
     * @param codR El nuevo código de reclutamiento.
     */
    public void setCodR(String codR) {
        this.codR = codR;
    }

    /**
     * Devuelve una representación en cadena de la información del reclutado, 
     * incluyendo nombre, apellido, cédula y código de reclutamiento.
     * 
     * @return Una cadena que representa la información completa del reclutado.
     */
    @Override
    public String toString() {
        return "Nombre: " + super.getNom() + ", Apellido: " + super.getApe() + ", Cédula: " + super.getCed() + ", Código de Reclutado: " + codR;
    }
    
}
