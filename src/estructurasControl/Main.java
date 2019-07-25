/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasControl;

import java.util.Scanner;

/**
 *
 * @author walte
 */
public class Main {

    public static void main(String[] args) {
        boolean coincidencia = false;
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0;
        int aleatorio = 0;
        do {
            try {
                aleatorio = (int) Math.floor(Math.random() * 5 + 1);
                System.out.print("Ingrese un numero: ");
                numeroIngresado = teclado.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Error: en el formato del numero");
            }finally{
                 if( aleatorio == numeroIngresado ){
                    System.out.println("Felicidades has ganado");
                    coincidencia = true;
                }else{
                     System.out.println("ERROR: No has ganado");
                 }
            }
        } while (coincidencia == false);
        
    }
}
