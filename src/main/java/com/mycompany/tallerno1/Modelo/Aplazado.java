/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

/**
 * La clase Aplazado representa a una persona en estado de aplazamiento 
 * dentro del sistema de gestión militar.
 * Hereda de la clase Persona, por lo que incluye los atributos de una persona 
 * (cédula, nombre, apellido) y añade un atributo específico (fecha de aplazamiento).
 * 
 * @author Jhon
 * @author Nicolas
 */
public class Aplazado extends Persona{
    /** Fecha de aplazamiento del servicio militar para la persona */
    private String dateA;

    /**
     * Constructor de la clase Aplazado que inicializa los atributos de la persona
     * (cédula, nombre, apellido) y la fecha de aplazamiento.
     * 
     * @param dateA Fecha de aplazamiento del servicio militar.
     * @param ced   Cédula de la persona.
     * @param nom   Nombre de la persona.
     * @param ape   Apellido de la persona.
     */
    public Aplazado(String dateA, String ced, String nom, String ape) {
        super(ced, nom, ape);
        this.dateA = dateA;
    }

    /**
     * Obtiene la fecha de aplazamiento.
     * 
     * @return La fecha de aplazamiento como una cadena de texto.
     */
    public String getDateA() {
        return dateA;
    }

    /**
     * Establece la fecha de aplazamiento.
     * 
     * @param dateA La nueva fecha de aplazamiento.
     */
    public void setDateA(String dateA) {
        this.dateA = dateA;
    }

    /**
     * Representación en cadena de texto del objeto Aplazado.
     * 
     * @return Una cadena con el nombre, apellido, cédula y fecha de aplazamiento.
     */
    @Override
    public String toString() {
        return "Nombre: " + super.getNom() + ", Apellido: " + super.getApe() + ", Cédula: " + super.getCed() + ", Fecha aplazado: " + dateA;
    }
    
}
