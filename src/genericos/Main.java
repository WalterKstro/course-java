/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;

/**
 *
 * @author walte
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Profesor> listadoPersona = new ArrayList<>();
        
        Profesor p1 = new Profesor("DBA", 155000, "Walter", "Cherec", 2070020);
        Profesor p2 = new Profesor("Dev", 175000, "Francisco", "Castro", 2860020);
        Genericos generico = new Genericos();
        
        generico.insertar(listadoPersona, p1);
        generico.insertar(listadoPersona, p2);
        
        generico.imprimirListado(listadoPersona);
        
        System.out.println("*************************");
        generico.borrarElemento(listadoPersona, p2);
        generico.imprimirListado(listadoPersona);
        
        System.out.println("*************************");
        System.out.println("Elemento: " + generico.buscarElemento(listadoPersona, p1).toString());
        
        
    }
}
