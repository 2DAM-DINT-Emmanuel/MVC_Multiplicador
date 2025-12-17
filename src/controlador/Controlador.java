/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author emmnavmoj
 */
public class Controlador implements ActionListener {
    
    // Declaramos las variables de las clases creadas hasta ahora
    private final Vista view;
    private final Modelo model;
    
    // Creamos el constructor de la clase, para incializar las variables
    public Controlador (Vista view, Modelo model){
        this.model = model;
        this.view = view;
        
        // Ahora lo que haremos es traer la acción del botón, accediendo a los botones de vista
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
    }   
    
    // Creamos un método para inicializar la vista
    public void iniciar(){
        // Le definimos un titulo
        view.setTitle("MVC MULTIPLICAR");
        
        // Centramos la posición de la ventana
        view.setLocationRelativeTo(null);
    }
    
    // Ahora realizaremos la función que va a realizar el botón de multiplicar
    @Override
    public void actionPerformed(ActionEvent e){ 
        try {
            // Obtenemos los valores de los campos de texto
           int num1 = Integer.parseInt(view.txtNumeroUno.getText());
           int num2 = Integer.parseInt(view.txtNumeroDos.getText());

           // Ahora invocaremos al modelo y estableceremos los set de las propiedades
           model.setNumeroUno(num1);
           model.setNumeroDos(num2);

            // Identificar qué botón fue presionado
            Object source = e.getSource();
            
           // Ejecutar la operación correspondiante según el boton seleccionado 
           if(source == view.btnMultiplicar){
               model.multiplicar();
               view.txtResultado.setText(String.valueOf(model.getResultado()));
           }
           else if(source == view.btnSumar){
                model.sumar();
                view.txtResultado.setText(String.valueOf(model.getResultado()));
           }
           else if(source == view.btnRestar){
                model.restar();
                view.txtResultado.setText(String.valueOf(model.getResultado()));
            }
            else if(source == view.btnDividir){
                 // Validar división por cero
                 if(num2 == 0){
                    JOptionPane.showMessageDialog(view, 
                        "Error: No se puede dividir entre cero", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    view.txtResultado.setText("");
                 } else {
                    float resultadoDivision = model.dividir();
                    view.txtResultado.setText(String.valueOf(resultadoDivision));
                 }
            }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(view, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
