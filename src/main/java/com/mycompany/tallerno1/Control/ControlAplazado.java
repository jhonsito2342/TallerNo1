/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Aplazado;

import java.util.ArrayList;

/**
 * La clase ControlAplazado gestiona una lista de objetos Aplazado.
 * Proporciona métodos para buscar y crear personas en estado de aplazado.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlAplazado {

    // Lista de personas en estado de aplazado.
    private ArrayList<Aplazado> aplazados;

    /**
     * Constructor de la clase ControlAplazado.
     * Inicializa la lista de personas en estado de aplazado.
     */
    public ControlAplazado() {
        aplazados = new ArrayList<Aplazado>();
    }

    /**
     * Busca un aplazado en la lista por su cédula.
     * 
     * @param cedAux La cédula del aplazado a buscar.
     * @return Una cadena con la información del aplazado encontrado. Si no se encuentra, devuelve una cadena vacía.
     */
    public String buscarAplazado(String cedAux) {
        StringBuilder sb = new StringBuilder();
        // Recorre la lista de aplazados para encontrar el que coincide con la cédula.
        for (Aplazado aplazado : aplazados) {
            if (aplazado.getCed().equals(cedAux)) {
                sb.append(aplazado.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Crea un nuevo aplazado y lo agrega a la lista.
     * 
     * @param ced La cédula del aplazado.
     * @param nom El nombre del aplazado.
     * @param ape El apellido del aplazado.
     * @param dateA La fecha de aplazamiento del aplazado.
     */
    public void crearAplazado(String ced, String nom, String ape, String dateA) {
        // Crea una nueva instancia de Aplazado y la agrega a la lista.
        Aplazado aplAux = new Aplazado(dateA, ced, nom, ape);
        aplazados.add(aplAux);
    }

    /**
     * Obtiene la lista de todos los aplazados.
     * 
     * @return La lista de aplazados.
     */
    public ArrayList<Aplazado> getAplazados() {
        return this.aplazados;
    }
}
