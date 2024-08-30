/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Reservista;
import com.mycompany.tallerno1.Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class ControlReservista {
    private ArrayList<Reservista> reservistas;

    public ControlReservista() {
    reservistas=new ArrayList<Reservista>();
    }
    public Reservista buscarAplazado(String cedAux) {
        for (Reservista reservista : reservistas) {
            if (reservista.getCed().equals(cedAux)) {
                return reservista;
            }
        }
        return null;
    }

    public void crearAplazado(String libM, String ced, String nom, String ape) {
        Reservista reserAux=new Reservista(nom, ced, nom, ape);
        reservistas.add(reserAux);
    }
    
    public ArrayList<Reservista> getAplazados(){
        return this.reservistas;
    }




}
