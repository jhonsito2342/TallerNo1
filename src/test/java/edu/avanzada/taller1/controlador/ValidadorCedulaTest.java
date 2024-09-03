/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import edu.avanzada.taller1.modelo.Remiso;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase ValidadorCedula.
 * Se prueba el método validarCedula.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ValidadorCedulaTest {

    private ValidadorCedula instance;

    public ValidadorCedulaTest() {
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
        instance = new ValidadorCedula();
    }

    @AfterEach
    public void tearDown() {
        // Se ejecuta después de cada prueba individual
        instance = null;
    }

    /**
     * Prueba del método validarCedula de la clase ValidadorCedula.
     */
    @Test
    public void testValidarCedula() {
        System.out.println("validarCedula");

        // Supongamos que ValidadorCedula espera listas de objetos del tipo Remiso
        ArrayList<Remiso>[] listas = new ArrayList[4];
        for (int i = 0; i < listas.length; i++) {
            listas[i] = new ArrayList<>();
        }

        // Creamos un objeto Remiso con la cédula que queremos probar
        String cedulaValida = "1234567890";
        Remiso remiso = new Remiso(cedulaValida, "Nombre", "Apellido");

        // Agregamos el objeto Remiso a una de las listas
        listas[0].add(remiso);

        // Caso de prueba: Cédula válida
        boolean expResult = true;  // Esperamos que la cédula se encuentre en una de las listas
        boolean result = instance.validarCedula(cedulaValida, listas);
        assertEquals(expResult, result, "La cédula debería ser válida y encontrarse en las listas.");
}
}
