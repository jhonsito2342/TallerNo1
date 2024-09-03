/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.modelo;

import edu.avanzada.taller1.modelo.Reclutado;
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
public class ReclutadoTest {
    
    private Reclutado reclutado; // Instancia de Reclutado para las pruebas
    
    public ReclutadoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        reclutado = new Reclutado("R001", "123456789", "Jhon", "Doe");
    }
    
    @AfterEach
    public void tearDown() {
        reclutado = null;
    }

    /**
     * Test of getCodR method, of class Reclutado.
     */
    @Test
    public void testGetCodR() {
        System.out.println("getCodR");
        // Valor esperado del código reclutado
        String expResult = "R001";
        // Llama al método getCodR() de la instancia de Reclutado
        String result = reclutado.getCodR();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test of setCodR method, of class Reclutado.
     */
    @Test
    public void testSetCodR() {
        System.out.println("setCodR");
        // Nuevo código reclutado para la instancia de Reclutado
        String codR = "R002";
        // Llama al método setCodR() para establecer el nuevo código reclutado
        reclutado.setCodR(codR);
        // Verifica que el código reclutado se haya actualizado correctamente
        assertEquals(codR, reclutado.getCodR());
    }
    
    
}
