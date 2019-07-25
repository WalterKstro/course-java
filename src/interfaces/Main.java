/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author walte
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> listado = GeneradorProductos.generarProductos(5);

//        for (Producto generarProducto : listado) {
//            generarProducto.imprimirInformacion();
//        }
//        
        //System.out.println("");
//        listado.get(3).imprimirInformacion();
        Iterator<Producto> iteracionProducto = listado.iterator();
        int contador = 0;
        while (iteracionProducto.hasNext()) {
            if (contador == 3) {
                iteracionProducto.remove();
            } else {
                iteracionProducto.next().imprimirInformacion();
                System.out.println("Iteracion: " + contador);
            }
            contador++;
        }

    }
}
