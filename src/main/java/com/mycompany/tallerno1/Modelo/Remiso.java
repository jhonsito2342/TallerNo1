/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

/**
 * La clase Remiso representa a una persona que está en estado de remiso.
 * Esta clase extiende de Persona y proporciona una forma específica 
 * de representar a una persona remisa.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class Remiso extends Persona{
    
    /**
     * Constructor de la clase Remiso.
     * 
     * @param ced La cédula de la persona.
     * @param nom El nombre de la persona.
     * @param ape El apellido de la persona.
     */
    public Remiso(String ced, String nom, String ape) {
        // Llama al constructor de la clase base Persona para inicializar los atributos.
        super(ced, nom, ape);
    }

    /**
     * Devuelve una representación en forma de cadena de esta persona remisa.
     * 
     * @return Una cadena que describe a la persona remisa, incluyendo nombre, apellido y cédula.
     */
    @Override
    public String toString() {
        // Devuelve una cadena con la información de la persona remisa.
        return "Nombre: " + super.getNom() + ", Apellido: " + super.getApe() + ", Cédula: " + super.getCed();
    }
}
