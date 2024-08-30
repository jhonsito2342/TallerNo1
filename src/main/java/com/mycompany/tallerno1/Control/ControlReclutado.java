/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Persona;
import com.mycompany.tallerno1.Modelo.Reclutado;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class ControlReclutado {

    private ArrayList<Reclutado> reclutados = new ArrayList<Reclutado>();

    public ControlReclutado() {
    
    }
    public Reclutado buscarAplazado(String cedAux) {
        for (Reclutado reclutado : reclutados) {
            if (reclutado.getCed().equals(cedAux)) {
                return reclutado;
            }
        }
        return null;
    }
    public void crearReclutado(String codR, String ced, String nom, String ape){
        Reclutado reclAux=new Reclutado(codR, ced, nom, ape);
        reclutados.add(reclAux);
    }
    public ArrayList<Reclutado> getReclutados(){
        return this.reclutados;
    }
}
