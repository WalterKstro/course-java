/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaPolimorfismo;

/**
 *
 * @author walte
 */
public class Main {
    public static void main(String[] args) {
        Futbolista cr7 = new Futbolista("Delantero", 100000, "Cristiano", "Ronaldo", 32, 3);
        Persona zz = new Futbolista("Mediocampista", 80000, "Zidane", "Zizou", 42, 2);
        System.out.println(cr7.imprimitDatosFutbolista());
        System.out.println(zz.toString());
    }
}
