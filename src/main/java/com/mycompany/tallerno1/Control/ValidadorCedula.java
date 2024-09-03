/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;
import com.mycompany.tallerno1.Modelo.Persona;
import java.util.ArrayList;
/**
 *
 * @author Estudiantes
 */
public class ValidadorCedula {
    public boolean validarCedula(String cedAux, ArrayList<? extends Persona>... listas){
        for(ArrayList<? extends Persona> lista: listas){
            for(Persona persona: lista){
                if(persona.getCed().equals(cedAux)){
                    return true;
                }
            }
        }
        return false;
    }
}
