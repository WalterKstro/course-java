/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraPila;

/**
 *
 * @author walte
 */
public class Main {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();
        pila.agregarElemento("Walter");
        pila.agregarElemento("Francisco");
        pila.agregarElemento("Cherec");
        pila.agregarElemento("Castro");
        
        System.out.println("Cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        pila.eliminarElemento();
        
        System.out.println("Nueva cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        System.out.println("Cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        pila.eliminarElemento();
        
        System.out.println("Nueva cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        System.out.println("Cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        pila.eliminarElemento();
        
        System.out.println("Nueva cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        System.out.println("Cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        pila.eliminarElemento();
        
        System.out.println("Nueva cima de la pila: " + pila.getElementoTop());
        System.out.println("Tamaño de la pila: " + pila.getSize());
        
        System.out.println("Esta vacio la pila? : " + pila.esVacio());
    }
}
