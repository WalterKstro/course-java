/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author walte
 */
public class Genericos<E> {
    public void insertar(ArrayList<E> listado, E elemento){
        listado.add(elemento);
    }
    public E buscarElemento(ArrayList<E> listado, E elemento){
        Iterator<E> iterator = listado.iterator();
        boolean encontrado = false;
        E e = null;
        while ((iterator.hasNext()) || (encontrado = false)) {            
            e = iterator.next();
            if (e.equals(elemento)) {
                encontrado = true;
                return e;
            }
        }
        return e;
    }
    public void borrarElemento(ArrayList<E> listado,E elemento){
        Iterator<E> list = listado.iterator();
        boolean encontrado = false;
        while ((list.hasNext()) || (encontrado = false)) {            
            E item = list.next();
            if (item.equals(elemento)) {
                list.remove();
                encontrado = true;
            }
        }
    }
    public void imprimirListado(ArrayList<E> listado){
        Iterator<E> iterator = listado.iterator();
        while (iterator.hasNext()) {            
            E elemento = iterator.next();
            System.out.println("Elemento: "+ elemento.toString());
        }
    }
}
