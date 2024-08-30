/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Remiso;
import com.mycompany.tallerno1.Modelo.Persona;
import com.mycompany.tallerno1.Modelo.Reclutado;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class ControlRemiso {
    private ArrayList<Remiso> remisos;

    public ControlRemiso() {
        remisos = new ArrayList<Remiso>();
    }
    
    public Remiso buscarAplazado(String cedAux) {
        for (Remiso remiso : remisos) {
            if (remiso.getCed().equals(cedAux)) {
                return remiso;
            }
        }
        return null;
    }

    public void crearAplazado(String ced, String nom, String ape) {
        Remiso remAux=new Remiso(ced, nom, ape);
        remisos.add(remAux);
    }
    
    public ArrayList<Remiso> getAplazados(){
        return this.remisos;
    }
}
