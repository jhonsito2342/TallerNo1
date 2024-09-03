/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.modelo;

import edu.avanzada.taller1.modelo.Reservista;
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
public class ReservistaTest {
    
    private Reservista reservista; // Instancia de Reservista para las pruebas
    
    public ReservistaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        reservista = new Reservista("Lib12345", "4567890123", "Jane", "Smith");
    }
    
    @AfterEach
    public void tearDown() {
        reservista = null;
    }

    /**
     * Test of getLibM method, of class Reservista.
     */
    @Test
    public void testGetLibM() {
        System.out.println("getLibM");
        // Valor esperado del número de libreta militar
        String expResult = "Lib12345";
        // Llama al método getLibM() de la instancia de Reservista
        String result = reservista.getLibM();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test of setLibM method, of class Reservista.
     */
    @Test
    public void testSetLibM() {
        System.out.println("setLibM");
        // Nuevo valor para la libreta militar
        String libM = "Lib67890";
        // Llama al método setLibM() para establecer el nuevo número de libreta militar
        reservista.setLibM(libM);
        // Verifica que el número de libreta militar se haya actualizado correctamente
        assertEquals(libM, reservista.getLibM());
    }
    
    
}
