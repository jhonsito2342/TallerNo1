/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.modelo;

import edu.avanzada.taller1.modelo.Remiso;
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
public class RemisoTest {
    
    private Remiso remiso; // Instancia de Remiso para las pruebas
    
    public RemisoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        remiso = new Remiso("123456789", "Jhon", "Doe");
    }
    
    @AfterEach
    public void tearDown() {
         remiso = null;
    }

    
    /**
     * Test del método getCed de la clase Remiso.
     */
    @Test
    public void testGetCed() {
        System.out.println("getCed");
        // Valor esperado de la cédula
        String expResult = "123456789";
        // Llama al método getCed() de la instancia de Remiso
        String result = remiso.getCed();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test del método setCed de la clase Remiso.
     */
    @Test
    public void testSetCed() {
        System.out.println("setCed");
        // Nueva cédula para la instancia de Remiso
        String ced = "987654321";
        // Llama al método setCed() para establecer la nueva cédula
        remiso.setCed(ced);
        // Verifica que la cédula se haya actualizado correctamente
        assertEquals(ced, remiso.getCed());
    }

    /**
     * Test del método getNom de la clase Remiso.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        // Valor esperado del nombre
        String expResult = "Jhon";
        // Llama al método getNom() de la instancia de Remiso
        String result = remiso.getNom();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test del método setNom de la clase Remiso.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        // Nuevo nombre para la instancia de Remiso
        String nom = "Jane";
        // Llama al método setNom() para establecer el nuevo nombre
        remiso.setNom(nom);
        // Verifica que el nombre se haya actualizado correctamente
        assertEquals(nom, remiso.getNom());
    }

    /**
     * Test del método getApe de la clase Remiso.
     */
    @Test
    public void testGetApe() {
        System.out.println("getApe");
        // Valor esperado del apellido
        String expResult = "Doe";
        // Llama al método getApe() de la instancia de Remiso
        String result = remiso.getApe();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test del método setApe de la clase Remiso.
     */
    @Test
    public void testSetApe() {
        System.out.println("setApe");
        // Nuevo apellido para la instancia de Remiso
        String ape = "Smith";
        // Llama al método setApe() para establecer el nuevo apellido
        remiso.setApe(ape);
        // Verifica que el apellido se haya actualizado correctamente
        assertEquals(ape, remiso.getApe());
    }
    
}
