/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraListas;

/**
 *
 * @author walte
 */
public class Main {

    public static void main(String[] args) {
        Listas<String> listado = new Listas<>();

        listado.addLast("1"); //0
        listado.addLast("2"); //1
        listado.addLast("3"); //2
        listado.addLast("4"); //3
        listado.addLast("5"); //4

//        listado.add("6", 4);
//        listado.remove(2);
//        System.out.println("Primer elemento: " + listado.getFirst());
//        System.out.println("Ultimo elemento: " + listado.getLast());
//        System.out.println("Tamaño de la lista: " + listado.getSize());
//        listado.removeFirst();
//        listado.removeLast();
//         System.out.println("Primer elemento: " + listado.getFirst());
//        System.out.println("Ultimo elemento: " + listado.getLast());
//        System.out.println("Tamaño de la lista: " + listado.getSize());
//        listado.remove(2);
//        System.out.println("Tamaño de la lista: " + listado.getSize());
//        
        System.out.println("Elemento: " + listado.getIndex(5));
        
        Listas<String> temp = new Listas<>();
        while (listado.isEmpty() == false) {
            System.out.println(listado.getFirst());
            temp.addFirst(listado.getFirst());
            listado.removeFirst();
        }
        listado = temp;

    }
}
