/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author emmnavmoj
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui llamaremos todo para ejecutar lo que queremos de manera correcta
        // Instaciamos los objetos
        Modelo mod = new Modelo();
        Vista view = new Vista();
        
        // Llamaremos al controlador y le enviaremos los parametros que hemos creado
        Controlador ctrl = new Controlador(view, mod);
        
        // Llamamos el métdo iniciar de la clase controlador
        ctrl.iniciar();
        
        // Establecemos a la vista que ya se puede ver o ya puede ser visible el JFrame
        view.setVisible(true);
    } 
}
