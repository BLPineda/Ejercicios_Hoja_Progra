/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_hoja;

/**
 *
 * @author lenin
 */
public class PilaInvertida {
    NodoPilaInvertida cima;
    int tamaño;

    public PilaInvertida() {
        cima = null;
        tamaño = 0;
    }
    
    public void push(String dato){
        NodoPilaInvertida nuevo = new NodoPilaInvertida(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
    
    public String pop(){
        String aux = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return aux;
    }
    
    public String cima(){
        return cima.dato;
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public boolean estaVacia(){
     return cima==null;   
    }
    
    public void limpiar(){
        while(!estaVacia()){
            pop();
        }
    }
    
    public void invertir(){
        String aux = cima.dato;
        StringBuilder strb = new StringBuilder(aux);
        aux = strb.reverse().toString();
        System.out.println(aux);
    }
}
