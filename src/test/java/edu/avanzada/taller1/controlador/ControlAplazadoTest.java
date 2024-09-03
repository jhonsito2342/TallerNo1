/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import edu.avanzada.taller1.modelo.Aplazado;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase ControlAplazado.
 * Se prueban todos los métodos públicos de la clase.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlAplazadoTest {

    private ControlAplazado instance;

    public ControlAplazadoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        // Este método se ejecuta una vez al inicio de las pruebas
    }

    @AfterAll
    public static void tearDownClass() {
        // Este método se ejecuta una vez al finalizar todas las pruebas
    }

    @BeforeEach
    public void setUp() {
        // Este método se ejecuta antes de cada prueba
        instance = new ControlAplazado();
    }

    @AfterEach
    public void tearDown() {
        // Este método se ejecuta después de cada prueba
        instance = null;
    }

    /**
     * Prueba del método buscarAplazado de la clase ControlAplazado.
     */
    @Test
    public void testBuscarAplazado() {
        System.out.println("buscarAplazado");
        String cedAux = "12345";
        
        // Se supone que este aplazado no existe, por lo que el resultado esperado es una cadena vacía
        String expResult = "";
        String result = instance.buscarAplazado(cedAux);
        
        assertEquals(expResult, result, "El aplazado no debería existir.");
    }

    /**
     * Prueba del método cambiarAplazado de la clase ControlAplazado.
     */
    @Test
    public void testCambiarAplazado() {
        System.out.println("cambiarAplazado");
        String cedAux = "12345";

        // Se supone que este aplazado no existe, por lo que el resultado esperado es null
        Aplazado expResult = null;
        Aplazado result = instance.cambiarAplazado(cedAux);
        
        assertEquals(expResult, result, "No se debería encontrar un aplazado para cambiar.");
    }

    /**
     * Prueba del método eliminarAplazado de la clase ControlAplazado.
     */
    @Test
    public void testEliminarAplazado() {
        System.out.println("eliminarAplazado");
        String cedAux = "12345";

        // Para esta prueba, asumimos que el método no lanza excepciones
        // Probablemente querrás verificar el estado después de intentar eliminar
        // Sin embargo, aquí no hay retorno, así que solo nos aseguramos de que no falle
        instance.eliminarAplazado(cedAux);
    }

    /**
     * Prueba del método mostrarReporteAplazados de la clase ControlAplazado.
     */
    @Test
    public void testMostrarReporteAplazados() {
        System.out.println("mostrarReporteAplazados");

        // Supongamos que no hay aplazados en la lista, el reporte debería estar vacío
        String expResult = "";
        String result = instance.mostrarReporteAplazados();
        
        assertEquals(expResult, result, "El reporte debería estar vacío.");
    }

    /**
     * Prueba del método crearAplazado de la clase ControlAplazado.
     */
    @Test
    public void testCrearAplazado() {
        System.out.println("crearAplazado");
        String ced = "12345";
        String nom = "John";
        String ape = "Doe";
        String dateA = "2024-09-03";

        // Llamamos al método para crear un nuevo aplazado
        instance.crearAplazado(ced, nom, ape, dateA);

        // Verificamos si el aplazado se creó correctamente
        String resultadoBusqueda = instance.buscarAplazado(ced);
        assertNotEquals("", resultadoBusqueda, "El aplazado debería haberse creado correctamente.");
    }

    /**
     * Prueba del método getAplazados de la clase ControlAplazado.
     */
    @Test
    public void testGetAplazados() {
        System.out.println("getAplazados");

        // Probamos si la lista de aplazados se inicializa correctamente
        ArrayList<Aplazado> result = instance.getAplazados();
        assertNotNull(result, "La lista de aplazados no debería ser null.");
    }
    
}
