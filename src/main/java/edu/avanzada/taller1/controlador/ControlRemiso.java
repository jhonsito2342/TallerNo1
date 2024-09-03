/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Persona;
import java.util.ArrayList;

/**
 * La clase ControlRemiso gestiona una lista de objetos Remiso. Proporciona
 * métodos para buscar y crear personas en estado de remiso.
 *
 * @author Jhon
 * @author Nicolas
 */
public class ControlRemiso {

    // Lista de personas en estado de remiso.
    private ArrayList<Remiso> remisos;

    /**
     * Constructor de la clase ControlRemiso. Inicializa la lista de personas en
     * estado de remiso.
     */
    public ControlRemiso() {
        remisos = new ArrayList<Remiso>();
    }

    /**
     * Busca un remiso en la lista por su cédula.
     *
     * @param cedAux La cédula del remiso a buscar.
     * @return Una cadena con la información del remiso encontrado. Si no se
     * encuentra, devuelve una cadena vacía.
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

    public Remiso cambiarRemiso(String cedAux) {
        Remiso remisoAux = null;
        for (Remiso remiso : remisos) {
            if (remiso.getCed().equals(cedAux)) {
                remisoAux = remiso;
            }
        }
        return remisoAux;
    }
    public void eliminarRemiso(String cedAux){
        for(Remiso remiso: remisos){
            if(remiso.getCed().equals(cedAux)){
                remisos.remove(remiso);
            }
        }
    }

    public String mostrarReporteRemisos() {
        String resultado;
        StringBuilder sb = new StringBuilder();
        for (Remiso remiso : remisos) {
            sb.append(remiso.toString()).append("\n");
        }
        resultado = sb.toString();
        return resultado;
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
