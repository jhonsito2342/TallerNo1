/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import edu.avanzada.taller1.modelo.Reclutado;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase ControlReclutado.
 * Se prueban todos los métodos públicos de la clase.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlReclutadoTest {

    private ControlReclutado instance;

    public ControlReclutadoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        // Este método se ejecuta una vez al inicio de todas las pruebas
    }

    @AfterAll
    public static void tearDownClass() {
        // Este método se ejecuta una vez al finalizar todas las pruebas
    }

    @BeforeEach
    public void setUp() {
        // Este método se ejecuta antes de cada prueba individual
        instance = new ControlReclutado();
    }

    @AfterEach
    public void tearDown() {
        // Este método se ejecuta después de cada prueba individual
        instance = null;
    }

    /**
     * Prueba del método cambiarReclutado de la clase ControlReclutado.
     */
    @Test
    public void testCambiarReclutado() {
        System.out.println("cambiarReclutado");
        String cedAux = "12345";

        // Se supone que este reclutado no existe, por lo que el resultado esperado es null
        Reclutado expResult = null;
        Reclutado result = instance.cambiarReclutado(cedAux);
        
        assertEquals(expResult, result, "No se debería encontrar un reclutado para cambiar.");
    }

    /**
     * Prueba del método buscarReclutado de la clase ControlReclutado.
     */
    @Test
    public void testBuscarReclutado() {
        System.out.println("buscarReclutado");
        String cedAux = "12345";
        
        // Se supone que este reclutado no existe, por lo que el resultado esperado es una cadena vacía
        String expResult = "";
        String result = instance.buscarReclutado(cedAux);
        
        assertEquals(expResult, result, "El reclutado no debería existir.");
    }

    /**
     * Prueba del método mostrarReporteReclutados de la clase ControlReclutado.
     */
    @Test
    public void testMostrarReporteReclutados() {
        System.out.println("mostrarReporteReclutados");

        // Supongamos que no hay reclutados en la lista, el reporte debería estar vacío
        String expResult = "";
        String result = instance.mostrarReporteReclutados();
        
        assertEquals(expResult, result, "El reporte debería estar vacío.");
    }

    /**
     * Prueba del método eliminarReclutado de la clase ControlReclutado.
     */
    @Test
    public void testEliminarReclutado() {
        System.out.println("eliminarReclutado");
        String cedAux = "12345";

        // Para esta prueba, asumimos que el método no lanza excepciones
        // Probablemente querrás verificar el estado después de intentar eliminar
        // Sin embargo, aquí no hay retorno, así que solo nos aseguramos de que no falle
        instance.eliminarReclutado(cedAux);
    }

    /**
     * Prueba del método crearReclutado de la clase ControlReclutado.
     */
    @Test
    public void testCrearReclutado() {
        System.out.println("crearReclutado");
        String codR = "67890";
        String ced = "12345";
        String nom = "John";
        String ape = "Doe";

        // Llamamos al método para crear un nuevo reclutado
        instance.crearReclutado(codR, ced, nom, ape);

        // Verificamos si el reclutado se creó correctamente
        String resultadoBusqueda = instance.buscarReclutado(ced);
        assertNotEquals("", resultadoBusqueda, "El reclutado debería haberse creado correctamente.");
    }

    /**
     * Prueba del método getReclutados de la clase ControlReclutado.
     */
    @Test
    public void testGetReclutados() {
        System.out.println("getReclutados");

        // Probamos si la lista de reclutados se inicializa correctamente
        ArrayList<Reclutado> result = instance.getReclutados();
        assertNotNull(result, "La lista de reclutados no debería ser null.");
    }
    
}
