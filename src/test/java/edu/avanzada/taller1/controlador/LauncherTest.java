/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.avanzada.taller1.controlador;

import edu.avanzada.taller1.vista.Interfaz;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**Pruebas unitarias para la clase Launcher.
 * 
 * Verifica que la clase Launcher se comporte como se espera al ejecutarse el método main.
 *
 * @author Jhon
 * @author Nicolas
 */
public class LauncherTest {

    @Test
    public void testMain() {
         // Ejecutar el método main de Launcher solo para crear la interfaz
        String[] args = {};
        Launcher.main(args);

        // Verificar la creación y visibilidad de la interfaz gráfica
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        assertTrue(interfaz.isVisible(), "La interfaz no está visible.");
    }
}
