/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author walte
 */
public class Variables {

    public static void main(String[] args) {
        double fuerza = 0.0;
        final double GRAVEDAD = 6.67e-11;
        double tierra = 5.97e24;
        double sol = 1.98e30;
        double distancia = 149600000;

        fuerza = GRAVEDAD * ((tierra * sol) / Math.pow(distancia, 2));

        System.out.println("La fuerza es de: " + fuerza + " Newtoons cuadrados");
    }
}
