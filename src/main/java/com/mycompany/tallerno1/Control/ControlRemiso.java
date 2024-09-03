/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Remiso;
import com.mycompany.tallerno1.Modelo.Persona;
import java.util.ArrayList;

/**
 * La clase ControlRemiso gestiona una lista de objetos Remiso.
 * Proporciona métodos para buscar y crear personas en estado de remiso.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlRemiso {
    // Lista de personas en estado de remiso.
    private ArrayList<Remiso> remisos;

    /**
     * Constructor de la clase ControlRemiso.
     * Inicializa la lista de personas en estado de remiso.
     */
    public ControlRemiso() {
        remisos = new ArrayList<Remiso>();
    }
    
    /**
     * Busca un remiso en la lista por su cédula.
     * 
     * @param cedAux La cédula del remiso a buscar.
     * @return Una cadena con la información del remiso encontrado. Si no se encuentra, devuelve una cadena vacía.
     */
    public String buscarRemiso(String cedAux) {
        StringBuilder sb = new StringBuilder();
        // Recorre la lista de remisos para encontrar el que coincide con la cédula.
        for (Remiso remiso : remisos) {
            if (remiso.getCed().equals(cedAux)) {
                sb.append(remiso.toString()).append("\n");
            }
        }
        return sb.toString();
    }
    public Persona cambiarRemiso(String cedAux, String codRecAux){
        Persona personaAux=null;
        for(Remiso remiso : remisos){
            if(remiso.getCed().equals(cedAux)){
                personaAux= remiso;
            }
        }
        return personaAux;
    }
    /**
     * Crea un nuevo remiso y lo agrega a la lista.
     * 
     * @param ced La cédula del remiso.
     * @param nom El nombre del remiso.
     * @param ape El apellido del remiso.
     */
    public void crearRemiso(String ced, String nom, String ape) {
        // Crea una nueva instancia de Remiso y la agrega a la lista.
        Remiso remAux = new Remiso(ced, nom, ape);
        remisos.add(remAux);
    }
    
    /**
     * Obtiene la lista de todos los remisos.
     * 
     * @return La lista de remisos.
     */
    public ArrayList<Remiso> getRemisos() {
        return this.remisos;
    }
}
