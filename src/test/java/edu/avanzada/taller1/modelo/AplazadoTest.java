/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.modelo;

import edu.avanzada.taller1.modelo.Aplazado;
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
public class AplazadoTest {
    
    private Aplazado aplazado;  // Instancia que se usará en las pruebas
    
    public AplazadoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        aplazado = new Aplazado("2024-08-29", "123456789", "Jhon", "Doe");  // Inicializa una instancia de Aplazado
    }
    
    @AfterEach
    public void tearDown() {
        aplazado = null;  // Limpia la instancia de Aplazado
    }

    /**
     * Test of getDateA method, of class Aplazado.
     */
    @Test
    public void testGetDateA() {
        System.out.println("getDateA");
        // Se define el resultado esperado
        String expResult = "2024-08-29";
        // Se obtiene el resultado actual de la instancia
        String result = aplazado.getDateA();
        // Compara el resultado esperado con el actual
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateA method, of class Aplazado.
     */
    @Test
    public void testSetDateA() {
        System.out.println("setDateA");
        // Nuevo valor de fecha para el aplazado
        String dateA = "2024-09-01";
        // Se establece la nueva fecha en la instancia
        aplazado.setDateA(dateA);
        // Verifica que el valor establecido sea el mismo que se estableció
        assertEquals(dateA, aplazado.getDateA());
    }
    
}
