/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emmnavmoj
 */
public class Modelo {
    //Atributos
    private int numeroUno;
    private int numeroDos;
    private int resultado;
    
    // Método de multiplicar, en el multiplicaremos los atributos numero1 y numero2 y lo devolveremos en un return
    public int multiplicar(){
        this.resultado = numeroUno * numeroDos;
        return resultado;
    }
    
    // Getters y Setters
    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
}
