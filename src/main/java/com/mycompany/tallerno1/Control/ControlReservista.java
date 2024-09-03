/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Reservista;
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
    public String buscarReservista(String cedAux) {
        StringBuilder sb = new StringBuilder();
        for (Reservista reservista : reservistas) {
            if (reservista.getCed().equals(cedAux)) {
                sb.append(reservista.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public void crearReservista(String libM, String ced, String nom, String ape) {
        Reservista reserAux=new Reservista(libM, ced, nom, ape);
        reservistas.add(reserAux);
    }
    
    public ArrayList<Reservista> getReservistas(){
        return this.reservistas;
    }




}
