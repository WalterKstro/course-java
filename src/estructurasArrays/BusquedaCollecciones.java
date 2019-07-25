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
public class BusquedaCollecciones {

    public static int busquedaSecuencialNoOrdeanda(int elemento, int[] almacen) {
        int inicial = 0;
        boolean encontrado = false;
        while ((inicial < almacen.length) || (encontrado == false)) {
            if (almacen[inicial] == elemento) {
                encontrado = true;
                return almacen[inicial];
            }
            inicial++;
        }
        return -1;
    }

    public static int busqeudaSecuencialOrdenada(int elemento, int[] almacen) {
        int extrenoInicial = 0;
        int extrenoFinal = almacen.length - 1;
        boolean encontrado = false;
        while ((encontrado == false) && (extrenoInicial < extrenoFinal)) {
            int centro = (extrenoInicial + extrenoFinal) / 2;
            if (elemento == almacen[centro]) {
                encontrado = true;
                return almacen[centro];
            } else if (elemento > almacen[centro]) {
                extrenoInicial = centro + 1;
            } else {
                extrenoFinal = centro - 1;
            }
        }
        return -1;
    }

}
