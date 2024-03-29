/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraCola;

/**
 *
 * @author walte
 */
public class Nodo<E> {
    private E elemento;
    private Nodo<E> anterior;
    private Nodo<E> siguiente;

    public Nodo() {
        this.anterior = null;
        this.siguiente = null;
        this.elemento = null;
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
     * @return the anterior
     */
    public Nodo<E> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo<E> anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
    
}
