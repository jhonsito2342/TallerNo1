/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;
import com.mycompany.tallerno1.Modelo.Persona;
import java.util.ArrayList;
/**
 * La clase ValidadorCedula proporciona un método para validar si una cédula ya existe
 * en una o más listas de objetos de tipo Persona o sus subtipos.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ValidadorCedula {
    /**
     * Valida si una cédula ya está presente en alguna de las listas proporcionadas.
     * 
     * @param cedAux La cédula a validar.
     * @param listas Una o más listas de objetos que extienden la clase Persona en las que buscar.
     * @return true si la cédula se encuentra en alguna de las listas, false en caso contrario.
     */
    public boolean validarCedula(String cedAux, ArrayList<? extends Persona>... listas) {
        // Recorre cada lista proporcionada.
        for (ArrayList<? extends Persona> lista : listas) {
            // Recorre cada persona en la lista.
            for (Persona persona : lista) {
                // Compara la cédula de la persona con la cédula proporcionada.
                if (persona.getCed().equals(cedAux)) {
                    return true; // La cédula ya existe en una de las listas.
                }
            }
        }
        return false; // La cédula no se encuentra en ninguna de las listas.
    }
}
