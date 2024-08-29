/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import com.mycompany.tallerno1.Modelo.Persona;
/**
 *
 * @author Jhon
 */
public class Gestor implements ActionListener{
    private ControlAplazado cntlApl;
    private ControlReclutado cntlRec;
    private ControlRemiso cntlRem;
    private ControlReservista cntlRes;
    private Interfaz vista;

    public Gestor() {
        cntlApl=new ControlAplazado();
        cntlRec=new ControlReclutado();
        cntlRem=new ControlRemiso();
        cntlRes=new ControlReservista();
        vista=new Interfaz();
        this.vista.setTitle("Registro y consulta de situacion militar");
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.jRadioButtonAplazado.addActionListener(this);
        this.vista.jButtonRegistar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jButtonRegistar&&vista.jRadioButtonAplazado.isSelected()){
            if(!validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados())&&!validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())){
                cntlApl.crearAplazado(vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText(), vista.jTextFieldFechApla.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            }else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
        }
    }
    
    public boolean validarCedula(String cedAux, ArrayList<? extends Persona>... listas){
        for(ArrayList<? extends Persona> lista: listas){
            for(Persona persona: lista){
                if(persona.getCed().equals(cedAux)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
