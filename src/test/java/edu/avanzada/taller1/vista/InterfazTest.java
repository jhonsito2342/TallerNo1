/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.vista;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jhon
 * @author Nicolas
 */
public class InterfazTest {
    
    public InterfazTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mostrarReporteEnDialogo method, of class Interfaz.
     */
    @Test
    public void testMostrarReporteEnDialogo() {
        System.out.println("mostrarReporteEnDialogo");
        String titulo = "";
        String contenido = "";
        Interfaz instance = new Interfaz();
        instance.mostrarReporteEnDialogo(titulo, contenido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarTextField method, of class Interfaz.
     */
    @Test
    public void testLimpiarTextField() {
        System.out.println("limpiarTextField");
        Interfaz instance = new Interfaz();
        instance.limpiarTextField();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarMensaje method, of class Interfaz.
     */
    @Test
    public void testMostrarMensaje() {
        System.out.println("mostrarMensaje");
        String msg = "";
        Interfaz instance = new Interfaz();
        instance.mostrarMensaje(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capturarString method, of class Interfaz.
     */
    @Test
    public void testCapturarString() {
        System.out.println("capturarString");
        String msg = "";
        Interfaz instance = new Interfaz();
        String expResult = "";
        String result = instance.capturarString(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of opcionMensaje method, of class Interfaz.
     */
    @Test
    public void testOpcionMensaje() {
        System.out.println("opcionMensaje");
        String op1 = "";
        String op2 = "";
        Interfaz instance = new Interfaz();
        int expResult = 0;
        int result = instance.opcionMensaje(op1, op2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
