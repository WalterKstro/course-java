/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraPila;

/**
 *
 * @author walte
 */
public class Nodo<E> {
    private E nodo;
    private Nodo<E> anterior;
    
    public Nodo() {
        this.nodo = null;
        this.anterior = null;
    }

    /**
     * @return the nodo
     */
    public E getNodo() {
        return nodo;
    }

    /**
     * @param nodo the nodo to set
     */
    public void setNodo(E nodo) {
        this.nodo = nodo;
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
}
