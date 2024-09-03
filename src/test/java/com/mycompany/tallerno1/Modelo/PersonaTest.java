/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tallerno1.Modelo;

import edu.avanzada.taller1.modelo.Persona;
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
public class PersonaTest {
    
    private Persona persona; // Instancia de Persona para las pruebas
    
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        persona = new Persona("123456789", "Jhon", "Doe");
    }
    
    @AfterEach
    public void tearDown() {
        persona = null;
    }

    /**
     * Test of getCed method, of class Persona.
     */
    @Test
    public void testGetCed() {
        System.out.println("getCed");
        // Valor esperado de la cédula
        String expResult = "123456789";
        // Llama al método getCed() de la instancia de Persona
        String result = persona.getCed();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test of setCed method, of class Persona.
     */
    @Test
    public void testSetCed() {
        System.out.println("setCed");
        // Nueva cédula para la instancia de Persona
        String ced = "987654321";
        // Llama al método setCed() para establecer la nueva cédula
        persona.setCed(ced);
        // Verifica que la cédula se haya actualizado correctamente
        assertEquals(ced, persona.getCed());
    }

    /**
     * Test of getNom method, of class Persona.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        // Valor esperado del nombre
        String expResult = "Jhon";
        // Llama al método getNom() de la instancia de Persona
        String result = persona.getNom();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Persona.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        // Nuevo nombre para la instancia de Persona
        String nom = "Jane";
        // Llama al método setNom() para establecer el nuevo nombre
        persona.setNom(nom);
        // Verifica que el nombre se haya actualizado correctamente
        assertEquals(nom, persona.getNom());
    }

    /**
     * Test of getApe method, of class Persona.
     */
    @Test
    public void testGetApe() {
        System.out.println("getApe");
        // Valor esperado del apellido
        String expResult = "Doe";
        // Llama al método getApe() de la instancia de Persona
        String result = persona.getApe();
        // Compara el valor esperado con el valor real
        assertEquals(expResult, result);
    }

    /**
     * Test of setApe method, of class Persona.
     */
    @Test
    public void testSetApe() {
        System.out.println("setApe");
        // Nuevo apellido para la instancia de Persona
        String ape = "Smith";
        // Llama al método setApe() para establecer el nuevo apellido
        persona.setApe(ape);
        // Verifica que el apellido se haya actualizado correctamente
        assertEquals(ape, persona.getApe());
    }
    
}
