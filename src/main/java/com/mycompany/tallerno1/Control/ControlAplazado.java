/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Aplazado;

import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class ControlAplazado {

    private ArrayList<Aplazado> aplazados;

    public ControlAplazado() {
        aplazados = new ArrayList<Aplazado>();
    }

    public String buscarAplazado(String cedAux) {
        StringBuilder sb = new StringBuilder();
        for (Aplazado aplazado : aplazados) {
            if (aplazado.getCed().equals(cedAux)) {
                sb.append(aplazado.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public void crearAplazado(String ced, String nom, String ape, String dateA) {
        Aplazado aplAux = new Aplazado(dateA, ced, nom, ape);
        aplazados.add(aplAux);
    }
    
    public ArrayList<Aplazado> getAplazados() {
        return this.aplazados;
    }
}
