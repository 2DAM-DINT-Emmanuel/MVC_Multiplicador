/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author emmnavmoj
 */
public class Controlador {
    
    // Declaramos las variables de las clases creadas hasta ahora
    private final Vista view;
    private final Modelo model;
    
    // Creamos el constructor de la clase, para incializar las variables
    public Controlador (Vista view, Modelo model){
        this.model = model;
        this.view = view;
        
        // Ahora lo que haremos es traer la acción del botón, accediendo a los botones de vista
        this.view.btnMultiplicar.addActionListener((ActionListener) this);
    }   
    
    // Creamos un método para inicializar la vista
    public void iniciar(){
        // Le definimos un titulo
        view.setTitle("MVC MULTIPLICAR");
        
        // Centramos la posición de la ventana
        view.setLocationRelativeTo(null);
    }
    
    // Ahora realizaremos la función que va a realizar el botón de multiplicar
    public void actionPerformed(ActionEvent e){
        // Ahora invocaremos al modelo y estableceremos los set de las propiedades
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        
        // Ya hemos enviado los valores, ahora lo que haremos es invocar el modelo de multiplicar
        // al método no le enviamos nada pues ya lo ha encapsulado.
        model.multiplicar();
        
        // Mostraremos el resultado en la caja de texto del resultado.
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
    
}
