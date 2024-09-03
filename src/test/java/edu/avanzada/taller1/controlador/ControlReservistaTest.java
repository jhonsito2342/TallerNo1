/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import edu.avanzada.taller1.modelo.Reservista;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase ControlReservista.
 * Se prueban todos los métodos públicos de la clase.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlReservistaTest {

    private ControlReservista instance;

    public ControlReservistaTest() {
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
        instance = new ControlReservista();
    }

    @AfterEach
    public void tearDown() {
        // Este método se ejecuta después de cada prueba individual
        instance = null;
    }

    /**
     * Prueba del método mostrarReporteReservistas de la clase ControlReservista.
     */
    @Test
    public void testMostrarReporteReservistas() {
        System.out.println("mostrarReporteReservistas");
        
        // Se asume que no hay reservistas inicialmente, el reporte debería estar vacío
        String expResult = "";
        String result = instance.mostrarReporteReservistas();
        
        assertEquals(expResult, result, "El reporte debería estar vacío.");
    }

    /**
     * Prueba del método cambiarAplazado de la clase ControlReservista.
     */
    @Test
    public void testCambiarAplazado() {
        System.out.println("cambiarAplazado");
        String cedAux = "12345";
        
        // Se asume que el reservista no existe, el resultado esperado es null
        Reservista expResult = null;
        Reservista result = instance.cambiarAplazado(cedAux);
        
        assertEquals(expResult, result, "No se debería encontrar un reservista para cambiar.");
    }

    /**
     * Prueba del método eliminarReservista de la clase ControlReservista.
     */
    @Test
    public void testEliminarReservista() {
        System.out.println("eliminarReservista");
        String cedAux = "12345";
        
        // Para esta prueba, asumimos que el método no lanza excepciones
        // Verificamos si el reservista se puede eliminar sin problemas
        instance.eliminarReservista(cedAux);
        
        // Se podría comprobar si el reservista ha sido eliminado verificando el tamaño de la lista, si fuera aplicable
    }

    /**
     * Prueba del método buscarReservista de la clase ControlReservista.
     */
    @Test
    public void testBuscarReservista() {
        System.out.println("buscarReservista");
        String cedAux = "12345";
        
        // Se asume que el reservista no existe, el resultado esperado es una cadena vacía
        String expResult = "";
        String result = instance.buscarReservista(cedAux);
        
        assertEquals(expResult, result, "El reservista no debería existir.");
    }

    /**
     * Prueba del método crearReservista de la clase ControlReservista.
     */
    @Test
    public void testCrearReservista() {
        System.out.println("crearReservista");
        String libM = "LM123";
        String ced = "12345";
        String nom = "Carlos";
        String ape = "Sánchez";

        // Llamamos al método para crear un nuevo reservista
        instance.crearReservista(libM, ced, nom, ape);

        // Verificamos si el reservista se creó correctamente
        String resultadoBusqueda = instance.buscarReservista(ced);
        assertNotEquals("", resultadoBusqueda, "El reservista debería haberse creado correctamente.");
    }

    /**
     * Prueba del método getReservistas de la clase ControlReservista.
     */
    @Test
    public void testGetReservistas() {
        System.out.println("getReservistas");

        // Probamos si la lista de reservistas se inicializa correctamente
        ArrayList<Reservista> result = instance.getReservistas();
        assertNotNull(result, "La lista de reservistas no debería ser null.");
    }
}
