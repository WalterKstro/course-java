/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasArrays;

/**
 *
 * @author walte
 */
public class Estructuras {

    public static void main(String[] args) {
        int[] numerosNoOrdenados = {1,9,6,4,3,2,455,600,12,40};
        System.out.println("Elemento No Ordenado: " + BusquedaCollecciones.busquedaSecuencialNoOrdeanda(1, numerosNoOrdenados));

        System.out.println("ORDENADO");
        OrdenacionCollecciones.OrdenacionBurbujaDesc(numerosNoOrdenados);
        for (int i = 0; i < numerosNoOrdenados.length; i++) {
            System.out.print(numerosNoOrdenados[i] +"-");
        }
        System.out.println("");
        System.out.println("Elemento Ordenado: " + BusquedaCollecciones.busqeudaSecuencialOrdenada(1, numerosNoOrdenados));
    }
}
