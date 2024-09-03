/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tallerno1.Control;

/**
 * La clase Launcher es el punto de entrada principal de la aplicación.
 * Se encarga de iniciar la aplicación creando una instancia de la clase Gestor,
 * que gestiona la lógica y la interfaz gráfica de usuario.
 * 
 * @author Jhon
 * @author Nicolas
 */
public class Launcher {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Argumentos de línea de comandos. No se utilizan en esta implementación.
     */
    public static void main(String[] args) {
        // Crea una instancia de Gestor, que inicializa y muestra la interfaz gráfica de usuario.
        new Gestor();
    }
    
}
