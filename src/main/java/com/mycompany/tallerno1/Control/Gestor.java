/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerno1.Control;

import com.mycompany.tallerno1.Modelo.Aplazado;
import com.mycompany.tallerno1.Modelo.Reclutado;
import com.mycompany.tallerno1.Modelo.Remiso;
import com.mycompany.tallerno1.Modelo.Reservista;
import com.mycompany.tallerno1.Vista.Interfaz;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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

        this.vista.jButtonLimpiar.addActionListener(this);
        this.vista.jButtonCambiarSituacion.addActionListener(this);
        
        this.vista.jButtonReporteAplazados.addActionListener(this);
        this.vista.jButtonReporteReclutados.addActionListener(this);
        this.vista.jButtonReporteRemisos.addActionListener(this);
        this.vista.jButtonReporteReservistas.addActionListener(this);

    }

    /**
     * Maneja los eventos de acción generados por los componentes de la interfaz gráfica.
     * 
     * @param e El evento de acción que se ha producido.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButtonBuscar) {

            String cedABuscar = vista.capturarString("Ingrese la cedula a buscar: ");
            if (!vldCed.validarCedula(cedABuscar, cntlApl.getAplazados()) && !vldCed.validarCedula(cedABuscar, cntlRes.getReservistas()) && !vldCed.validarCedula(cedABuscar, cntlRem.getRemisos()) && !vldCed.validarCedula(cedABuscar, cntlRec.getReclutados())) {
                vista.mostrarMensaje("La cedula no se encuentra registrada");
            } else {
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

            vista.limpiarTextField();
        }
        if(e.getSource()==vista.jButtonCambiarSituacion){
            
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonAplazado.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlApl.crearAplazado(vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText(), vista.jTextFieldFechApla.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
            vista.limpiarTextField();
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonReclutado.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlRec.crearReclutado(vista.jTextFieldCodRec.getText(), vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
            vista.limpiarTextField();
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonRemiso.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlRem.crearRemiso(vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
            vista.limpiarTextField();
        }
        if (e.getSource() == vista.jButtonRegistar && vista.jRadioButtonReservista.isSelected()) {
            if (!vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlApl.getAplazados()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRes.getReservistas()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRem.getRemisos()) && !vldCed.validarCedula(vista.jTextFieldCedula.getText(), cntlRec.getReclutados())) {
                cntlRes.crearReservista(vista.jTextFieldLibretaMil.getText(), vista.jTextFieldCedula.getText(), vista.jTextFieldNombre.getText(), vista.jTextFieldApellido.getText());
                vista.mostrarMensaje("Se ha registrado correctamente");
            } else {
                vista.mostrarMensaje("La cedula ya se encuentra registrada");
            }
            vista.limpiarTextField();
        }
        if (e.getSource() == vista.jButtonLimpiar) {
            vista.limpiarTextField();
        }
        if (e.getSource() == vista.jRadioButtonAplazado) {
            vista.jTextFieldLibretaMil.setEnabled(false);
            vista.jTextFieldCodRec.setEnabled(false);
            vista.jTextFieldFechApla.setEnabled(true);
        } else if (e.getSource() == vista.jRadioButtonReclutado) {
            vista.jTextFieldFechApla.setEnabled(false);
            vista.jTextFieldCodRec.setEnabled(true);
            vista.jTextFieldLibretaMil.setEnabled(false);
        } else if (e.getSource() == vista.jRadioButtonRemiso) {
            vista.jTextFieldFechApla.setEnabled(false);
            vista.jTextFieldLibretaMil.setEnabled(false);
            vista.jTextFieldCodRec.setEnabled(false);
        } else if (e.getSource() == vista.jRadioButtonReservista) {
            vista.jTextFieldLibretaMil.setEnabled(true);
            vista.jTextFieldCodRec.setEnabled(false);
            vista.jTextFieldFechApla.setEnabled(false);
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
        
        if (e.getSource() == vista.jButtonReporteAplazados) {
            mostrarReporteAplazados();
        }
        if (e.getSource() == vista.jButtonReporteReclutados) {
            mostrarReporteReclutados();
        }
        if (e.getSource() == vista.jButtonReporteRemisos) {
            mostrarReporteRemisos();
        }
        if (e.getSource() == vista.jButtonReporteReservistas) {
            mostrarReporteReservistas();
        }
    }
    
    private void mostrarReporteEnDialogo(String titulo, String contenido) {
    // Crear un JDialog
    JDialog dialogo = new JDialog((Frame) null, titulo, true);
    dialogo.setSize(400, 300);
    dialogo.setLocationRelativeTo(null);

    // Crear un JTextArea para mostrar el contenido del reporte
    JTextArea textArea = new JTextArea();
    textArea.setText(contenido);
    textArea.setEditable(false);

    // Agregar el JTextArea a un JScrollPane
    JScrollPane scrollPane = new JScrollPane(textArea);
    dialogo.add(scrollPane);

    // Mostrar el JDialog
    dialogo.setVisible(true);
    }
    
    private void mostrarReporteAplazados() {
        StringBuilder sb = new StringBuilder();
        for (Aplazado aplazado : cntlApl.getAplazados()) {
            sb.append(aplazado.toString()).append("\n");
        }
        mostrarReporteEnDialogo("Reporte de Aplazados", sb.toString());
    }

    private void mostrarReporteReclutados() {
        StringBuilder sb = new StringBuilder();
        for (Reclutado reclutado : cntlRec.getReclutados()) {
            sb.append(reclutado.toString()).append("\n");
        }
        mostrarReporteEnDialogo("Reporte de Reclutados", sb.toString());
    }

    private void mostrarReporteRemisos() {
        StringBuilder sb = new StringBuilder();
        for (Remiso remiso : cntlRem.getRemisos()) {
            sb.append(remiso.toString()).append("\n");
        }
        mostrarReporteEnDialogo("Reporte de Remisos", sb.toString());
    }

    private void mostrarReporteReservistas() {
        StringBuilder sb = new StringBuilder();
        for (Reservista reservista : cntlRes.getReservistas()) {
            sb.append(reservista.toString()).append("\n");
        }
        mostrarReporteEnDialogo("Reporte de Reservistas", sb.toString());
    }
}

