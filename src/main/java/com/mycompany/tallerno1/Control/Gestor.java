/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jhon
 */
public class Gestor implements ActionListener {

    private ControlAplazado cntlApl;
    private ControlReclutado cntlRec;
    private ControlRemiso cntlRem;
    private ControlReservista cntlRes;
    private ValidadorCedula vldCed;
    private Interfaz vista;

    public Gestor() {
        vldCed = new ValidadorCedula();
        cntlApl = new ControlAplazado();
        cntlRec = new ControlReclutado();
        cntlRem = new ControlRemiso();
        cntlRes = new ControlReservista();
        vista = new Interfaz();
        this.vista.setTitle("Registro y consulta de situacion militar");
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.jRadioButtonReclutado.addActionListener(this);
        this.vista.jRadioButtonReservista.addActionListener(this);
        this.vista.jRadioButtonRemiso.addActionListener(this);
        this.vista.jRadioButtonAplazado.addActionListener(this);
        this.vista.jButtonRegistar.addActionListener(this);
        this.vista.jButtonBuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButtonBuscar) {
            String cedABuscar = vista.capturarString("Ingrese la cedula a buscar: ");
            String auxString = cntlApl.buscarAplazado(cedABuscar);
            if (!auxString.isEmpty()) {
                vista.mostrarMensaje(auxString);
            }
            auxString = cntlRec.buscarReclutado(cedABuscar);
            if (!auxString.isEmpty()) {
                vista.mostrarMensaje(auxString);
            }
            auxString = cntlRem.buscarRemiso(cedABuscar);
            if (!auxString.isEmpty()) {
                vista.mostrarMensaje(auxString);
            }
            auxString = cntlRes.buscarReservista(cedABuscar);
            if (!auxString.isEmpty()) {
                vista.mostrarMensaje(auxString);
            }
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonAplazado.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlApl.crearAplazado(vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText(), vista.jTextFieldFechApla.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonReclutado.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlRec.crearReclutado(vista.jTextFieldCodRec.getText(), vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonRemiso.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlRem.crearRemiso(vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonReservista.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlRes.crearReservista(vista.jTextFieldLibretaMil.getText(), vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
        }
    }
}
