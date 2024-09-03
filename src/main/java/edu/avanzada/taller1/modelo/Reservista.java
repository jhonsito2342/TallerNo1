/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 * La clase Reservista representa a una persona que está en estado de reservista.
 * Esta clase extiende de Persona y añade el atributo específico de libreta militar.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class Reservista extends Persona{
    
    // La libreta militar del reservista.
    private String libM;

    /**
     * Constructor de la clase Reservista.
     * 
     * @param libM La libreta militar del reservista.
     * @param ced La cédula de la persona.
     * @param nom El nombre de la persona.
     * @param ape El apellido de la persona.
     */
    public Reservista(String libM, String ced, String nom, String ape) {
        // Llama al constructor de la clase base Persona para inicializar los atributos.
        super(ced, nom, ape);
        this.libM = libM;
    }

    /**
     * Obtiene la libreta militar del reservista.
     * 
     * @return La libreta militar del reservista.
     */
    public String getLibM() {
        return libM;
    }

    /**
     * Establece la libreta militar del reservista.
     * 
     * @param libM La nueva libreta militar del reservista.
     */
    public void setLibM(String libM) {
        this.libM = libM;
    }

    /**
     * Devuelve una representación en forma de cadena de este reservista.
     * 
     * @return Una cadena que describe al reservista, incluyendo nombre, apellido, cédula y libreta militar.
     */
    @Override
    public String toString() {
        // Devuelve una cadena con la información del reservista.
        return "Nombre: " + super.getNom() + ", Apellido: " + super.getApe() + ", Cédula: " + super.getCed() + ", Libreta militar: " + libM;
    }
}
