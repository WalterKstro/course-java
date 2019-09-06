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
public interface MetodosInterfaz<E> {
    public void addFirst(E e);
    public void addLast(E e);
    public void add(E e, int posicion);
    public void removeFirst();
    public void removeLast();
    public void remove(int posicion);
    public boolean isEmpty();
    public int size();
    public E getFirst();
    public E getLast();
    public E getIndex(int posicion);
    public boolean contain(E e);
}









