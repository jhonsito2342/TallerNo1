/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import edu.avanzada.taller1.modelo.Reservista;
import java.util.ArrayList;

/**
 * La clase ControlReservista gestiona una lista de objetos Reservista.
 * Proporciona métodos para buscar y crear personas en estado de reservista.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlReservista {
    // Lista de personas en estado de reservista.
    private ArrayList<Reservista> reservistas;

    /**
     * Constructor de la clase ControlReservista.
     * Inicializa la lista de personas en estado de reservista.
     */
    public ControlReservista() {
        reservistas = new ArrayList<Reservista>();
    }
    public String mostrarReporteReservistas() {
        String resultado;
        StringBuilder sb = new StringBuilder();
        for (Reservista reservista : reservistas) {
            sb.append(reservista.toString()).append("\n");
        }resultado=sb.toString();
        return resultado;
    }
    public Reservista cambiarAplazado(String cedAux){
        Reservista reservistaAux=null;
        for(Reservista reservista : reservistas){
            if(reservista.getCed().equals(cedAux)){
                reservistaAux= reservista;
            }
        }
        return reservistaAux;
    }
    public void eliminarReservista(String cedAux){
        for(Reservista reservista : reservistas){
            if(reservista.getCed().equals(cedAux)){
                reservistas.remove(reservista);
            }
        }
    }
    /**
     * Busca un reservista en la lista por su cédula.
     * 
     * @param cedAux La cédula del reservista a buscar.
     * @return Una cadena con la información del reservista encontrado. Si no se encuentra, devuelve una cadena vacía.
     */
    public String buscarReservista(String cedAux) {
        StringBuilder sb = new StringBuilder();
        // Recorre la lista de reservistas para encontrar el que coincide con la cédula.
        for (Reservista reservista : reservistas) {
            if (reservista.getCed().equals(cedAux)) {
                sb.append(reservista.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Crea un nuevo reservista y lo agrega a la lista.
     * 
     * @param libM La libreta militar del reservista.
     * @param ced La cédula del reservista.
     * @param nom El nombre del reservista.
     * @param ape El apellido del reservista.
     */
    public void crearReservista(String libM, String ced, String nom, String ape) {
        // Crea una nueva instancia de Reservista y la agrega a la lista.
        Reservista reserAux = new Reservista(libM, ced, nom, ape);
        reservistas.add(reserAux);
    }
    
    /**
     * Obtiene la lista de todos los reservistas.
     * 
     * @return La lista de reservistas.
     */
    public ArrayList<Reservista> getReservistas() {
        return this.reservistas;
    }
}
