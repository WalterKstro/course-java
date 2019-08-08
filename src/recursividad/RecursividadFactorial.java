/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author walte
 */
public class RecursividadFactorial {

    public static double NumberFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * NumberFactorial(--number);
        }
    }

    public static int Fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return Fibonacci(number - 2) + Fibonacci(number - 1);
        }
    }
}
