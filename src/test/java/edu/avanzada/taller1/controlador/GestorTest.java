/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Gestor.
 * Se prueba el método actionPerformed.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class GestorTest {

    private Gestor instance;

    public GestorTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        // Se ejecuta una vez al inicio de todas las pruebas
    }

    @AfterAll
    public static void tearDownClass() {
        // Se ejecuta una vez al finalizar todas las pruebas
    }

    @BeforeEach
    public void setUp() {
        // Se ejecuta antes de cada prueba individual
        instance = new Gestor();
    }

    @AfterEach
    public void tearDown() {
        // Se ejecuta después de cada prueba individual
        instance = null;
    }

    /**
     * Prueba del método actionPerformed de la clase Gestor.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");

        // Simulamos un evento de acción
        ActionEvent e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "comandoTest");

        // Llamamos al método a probar
        instance.actionPerformed(e);

        
    }
}
