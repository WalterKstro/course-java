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
public class Nodo<E> {
   private E elemento;
   private Nodo<E> prev;
   private Nodo<E> next;
   
   public Nodo(){
    this.elemento = null;
    this.next = null;
    this.prev = null;
   }
    /**
     * @return the elemento
     */
    public E getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the prev
     */
    public Nodo<E> getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Nodo<E> prev) {
        this.prev = prev;
    }

    /**
     * @return the next
     */
    public Nodo<E> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo<E> next) {
        this.next = next;
    }
   
}
