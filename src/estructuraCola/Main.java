/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraCola;

/**
 *
 * @author walte
 */
public class Main {
    public static void main(String[] args) {
        Cola<String> cola = new Cola<String>();
        System.out.println("Esta vacio la cola?: " + cola.isEmpty());
        cola.setElement("Walter");
        cola.setElement("Francisco");
        cola.setElement("Cherec");
        cola.setElement("Castro");
        cola.setElement("Juan");
        cola.setElement("Perez");
        System.out.println("Esta vacio la cola?: " + cola.isEmpty());
        
        System.out.println("Primer elemento: " + cola.getFront());
        System.out.println("Ultimo elemento: " + cola.getBack());
        
        System.out.println("Elementos en la cola: " + cola.getSize());
        cola.deleteElement();
        cola.deleteElement();
        System.out.println("Elementos en la cola: " + cola.getSize());
        System.out.println("Primer elemento: " + cola.getFront());
    }
}
