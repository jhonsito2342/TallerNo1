/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author estudiantes
 */
public class AplazadoTest {
    static Aplazado aplazado;
    public AplazadoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    aplazado= new Aplazado("8 de agosto", "01239021", "Andres", "Garzon");
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
     * Test of getDateA method, of class Aplazado.
     */
    @Test
    public void testGetDateA() {
        System.out.println("getDateA");
        String expResult = "8 de agosto";
        String result = aplazado.getDateA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setDateA method, of class Aplazado.
     */
    @Test
    public void testSetDateA() {
        System.out.println("setDateA");
        String dateA = "";
        Aplazado instance = new Aplazado(dateA, dateA, dateA, dateA);
        instance.setDateA(dateA);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
