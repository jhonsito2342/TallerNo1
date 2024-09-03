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
 * Clase de pruebas unitarias para la clase ControlRemiso.
 * Se prueban todos los métodos públicos de la clase.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class ControlRemisoTest {

    private ControlRemiso instance;

    public ControlRemisoTest() {
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
        instance = new ControlRemiso();
    }

    @AfterEach
    public void tearDown() {
        // Este método se ejecuta después de cada prueba individual
        instance = null;
    }

    /**
     * Prueba del método buscarRemiso de la clase ControlRemiso.
     */
    @Test
    public void testBuscarRemiso() {
        System.out.println("buscarRemiso");
        String cedAux = "12345";
        
        // Se supone que este remiso no existe, por lo que el resultado esperado es una cadena vacía
        String expResult = "";
        String result = instance.buscarRemiso(cedAux);
        
        assertEquals(expResult, result, "El remiso no debería existir.");
    }

    /**
     * Prueba del método cambiarRemiso de la clase ControlRemiso.
     */
    @Test
    public void testCambiarRemiso() {
        System.out.println("cambiarRemiso");
        String cedAux = "12345";
        
        // Se supone que este remiso no existe, por lo que el resultado esperado es null
        Remiso expResult = null;
        Remiso result = instance.cambiarRemiso(cedAux);
        
        assertEquals(expResult, result, "No se debería encontrar un remiso para cambiar.");
    }

    /**
     * Prueba del método eliminarRemiso de la clase ControlRemiso.
     */
    @Test
    public void testEliminarRemiso() {
        System.out.println("eliminarRemiso");
        String cedAux = "12345";
        
        // Para esta prueba, asumimos que el método no lanza excepciones
        // Verificamos si el remiso se puede eliminar sin problemas
        instance.eliminarRemiso(cedAux);
        
        // Se podría comprobar si el remiso ha sido eliminado verificando el tamaño de la lista, si fuera aplicable
    }

    /**
     * Prueba del método mostrarReporteRemisos de la clase ControlRemiso.
     */
    @Test
    public void testMostrarReporteRemisos() {
        System.out.println("mostrarReporteRemisos");

        // Supongamos que no hay remisos en la lista, el reporte debería estar vacío
        String expResult = "";
        String result = instance.mostrarReporteRemisos();
        
        assertEquals(expResult, result, "El reporte debería estar vacío.");
    }

    /**
     * Prueba del método crearRemiso de la clase ControlRemiso.
     */
    @Test
    public void testCrearRemiso() {
        System.out.println("crearRemiso");
        String ced = "12345";
        String nom = "Juan";
        String ape = "Pérez";

        // Llamamos al método para crear un nuevo remiso
        instance.crearRemiso(ced, nom, ape);

        // Verificamos si el remiso se creó correctamente
        String resultadoBusqueda = instance.buscarRemiso(ced);
        assertNotEquals("", resultadoBusqueda, "El remiso debería haberse creado correctamente.");
    }

    /**
     * Prueba del método getRemisos de la clase ControlRemiso.
     */
    @Test
    public void testGetRemisos() {
        System.out.println("getRemisos");

        // Probamos si la lista de remisos se inicializa correctamente
        ArrayList<Remiso> result = instance.getRemisos();
        assertNotNull(result, "La lista de remisos no debería ser null.");
    }
    
}
