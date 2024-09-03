/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Persona;
import com.mycompany.tallerno1.Modelo.Reclutado;
import java.util.ArrayList;

/**
 * La clase ControlReclutado gestiona una lista de objetos Reclutado.
 * Proporciona métodos para buscar y crear personas en estado de reclutado.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlReclutado {

    // Lista de personas en estado de reclutado.
    private ArrayList<Reclutado> reclutados;

    /**
     * Constructor de la clase ControlReclutado.
     * Inicializa la lista de personas en estado de reclutado.
     */
    public ControlReclutado() {
        reclutados = new ArrayList<Reclutado>();
    }

    /**
     * Busca un reclutado en la lista por su cédula.
     * 
     * @param cedAux La cédula del reclutado a buscar.
     * @return Una cadena con la información del reclutado encontrado. Si no se encuentra, devuelve una cadena vacía.
     */
    public Reclutado cambiarReclutado(String cedAux){
        Reclutado reclutadoAux=null;
        for(Reclutado reclutado : reclutados){
            if(reclutado.getCed().equals(cedAux)){
                reclutadoAux= reclutado;
            }
        }
        return reclutadoAux;
    }
    public String buscarReclutado(String cedAux) {
        StringBuilder sb = new StringBuilder();
        // Recorre la lista de reclutados para encontrar el que coincide con la cédula.
        for (Reclutado reclutado : reclutados) {
            if (reclutado.getCed().equals(cedAux)) {
                sb.append(reclutado.toString()).append("\n");
            }
        }
        return sb.toString();
    }
    public String mostrarReporteReclutados() {
        String resultado;
        StringBuilder sb = new StringBuilder();
        for (Reclutado reclutado : reclutados) {
            sb.append(reclutado.toString()).append("\n");
        }
        resultado=sb.toString();
        return resultado ;
    }
    public void eliminarReclutado(String cedAux){
        for(Reclutado reclutado : reclutados){
            if(reclutado.getCed().equals(cedAux)){
                reclutados.remove(reclutado);
            }
        }
    }
    /**
     * Crea un nuevo reclutado y lo agrega a la lista.
     * 
     * @param codR El código del reclutado.
     * @param ced La cédula del reclutado.
     * @param nom El nombre del reclutado.
     * @param ape El apellido del reclutado.
     */
    public void crearReclutado(String codR, String ced, String nom, String ape) {
        // Crea una nueva instancia de Reclutado y la agrega a la lista.
        Reclutado reclAux = new Reclutado(codR, ced, nom, ape);
        reclutados.add(reclAux);
    }

    /**
     * Obtiene la lista de todos los reclutados.
     * 
     * @return La lista de reclutados.
     */
    public ArrayList<Reclutado> getReclutados() {
        return this.reclutados;
    }
}
