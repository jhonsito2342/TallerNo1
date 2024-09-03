/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * La clase Gestor es el controlador principal que maneja las interacciones entre la vista y los modelos.
 * Implementa la interfaz ActionListener para responder a los eventos de acción generados por la interfaz gráfica.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class Gestor implements ActionListener {

    // Controladores para cada tipo de estado de la persona.
    private ControlAplazado cntlApl;
    private ControlReclutado cntlRec;
    private ControlRemiso cntlRem;
    private ControlReservista cntlRes;
    
    // Validador para verificar cédulas.
    private ValidadorCedula vldCed;
    
    // Interfaz gráfica de usuario.
    private Interfaz vista;

    /**
     * Constructor de la clase Gestor.
     * Inicializa los controladores, el validador y la interfaz gráfica.
     * Configura la interfaz y agrega los escuchadores de eventos a los componentes.
     */
    public Gestor() {
        vldCed = new ValidadorCedula();
        cntlApl = new ControlAplazado();
        cntlRec = new ControlReclutado();
        cntlRem = new ControlRemiso();
        cntlRes = new ControlReservista();
        vista = new Interfaz();
        
        // Configura la interfaz gráfica.
        this.vista.setTitle("Registro y consulta de situación militar");
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        
        // Agrega los escuchadores de eventos a los botones y radio buttons.
        this.vista.jRadioButtonReclutado.addActionListener(this);
        this.vista.jRadioButtonReservista.addActionListener(this);
        this.vista.jRadioButtonRemiso.addActionListener(this);
        this.vista.jRadioButtonAplazado.addActionListener(this);
        this.vista.jButtonRegistar.addActionListener(this);
        this.vista.jButtonBuscar.addActionListener(this);
    }

    /**
     * Maneja los eventos de acción generados por los componentes de la interfaz gráfica.
     * 
     * @param e El evento de acción que se ha producido.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButtonBuscar) {
            // Maneja la búsqueda de una persona por su cédula.
            String cedABuscar = vista.capturarString("Ingrese la cédula a buscar: ");
            String auxString;

            auxString = cntlApl.buscarAplazado(cedABuscar);
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
            vista.limpiarTextField();
        }
        
        if (e.getSource() == vista.jButtonRegistar) {
            // Maneja el registro de una nueva persona según el tipo seleccionado.
            boolean cedulaValida = !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) &&
                                   !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) &&
                                   !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) &&
                                   !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados());

            if (vista.jRadioButtonAplazado.isSelected()) {
                if (cedulaValida) {
                    cntlApl.crearAplazado(vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText(), vista.jTextFieldFechApla.getText());
                    vista.mostrarMensaje("Se ha registrado correctamente");
                } else {
                    vista.mostrarMensaje("La cédula ya se encuentra registrada");
                }
            } else if (vista.jRadioButtonReclutado.isSelected()) {
                if (cedulaValida) {
                    cntlRec.crearReclutado(vista.jTextFieldCodRec.getText(), vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                    vista.mostrarMensaje("Se ha registrado correctamente");
                } else {
                    vista.mostrarMensaje("La cédula ya se encuentra registrada");
                }
            } else if (vista.jRadioButtonRemiso.isSelected()) {
                if (cedulaValida) {
                    cntlRem.crearRemiso(vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                    vista.mostrarMensaje("Se ha registrado correctamente");
                } else {
                    vista.mostrarMensaje("La cédula ya se encuentra registrada");
                }
            } else if (vista.jRadioButtonReservista.isSelected()) {
                if (cedulaValida) {
                    cntlRes.crearReservista(vista.jTextFieldLibretaMil.getText(), vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                    vista.mostrarMensaje("Se ha registrado correctamente");
                } else {
                    vista.mostrarMensaje("La cédula ya se encuentra registrada");
                }
            }
            
            vista.limpiarTextField();
        }
    }
}
