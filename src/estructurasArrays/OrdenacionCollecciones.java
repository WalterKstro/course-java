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
public class OrdenacionCollecciones {

    public static void OrdenacionBurbujaDesc(int[] almacen) {
        int auxiliar;
        for (int i = 0; i < almacen.length - 1; i++) {
            for (int j = 0; j < almacen.length - 1; j++) {
                if (almacen[j] > almacen[j + 1]) {
                    auxiliar = almacen[j];
                    almacen[j] = almacen[j + 1];
                    almacen[j + 1] = auxiliar;
                }
            }
        }
    }
}
