/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoCalculadora;

/**
 *
 * @author walte
 */
public class Calculadora {
    public static double Sumar(double a, double b){
        return a+b;
    }
    public static double Restar(double a, double b){
        return a>b?a-b:0;
    }
    public static double Multiplicar(double a, double b){
        return a*b;
    }
    public static double Dividir(double a, double b){
        return b!=0?a/b:0;
    }
    public static double Potencia(double a, double b){
        return Math.pow(a, b);
    }
}
