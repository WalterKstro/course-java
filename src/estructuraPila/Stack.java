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
public class Stack<E> implements InterfaceStack<E> {

    private int size;
    private Nodo<E> top;

    public Stack() {
        this.size = 0;
        this.top = null;
    }

    @Override
    public void agregarElemento(E e) {
        if (esVacio()) {
            Nodo<E> nodo = new Nodo<E>();
            nodo.setNodo(e);
            nodo.setAnterior(null);
            this.setTop(nodo);
            this.setSize(++size);
        } else {
            Nodo<E> nodo = new Nodo<E>();
            nodo.setNodo(e);
            nodo.setAnterior(this.getTop());
            this.setTop(nodo);
            this.setSize(++size);
        }
    }

    @Override
    public void eliminarElemento() {
        if (esVacio()) {
            System.out.println("La pila esta vacio");
        } else {
            this.setTop(this.top.getAnterior());
            this.setSize(--size);
        }
    }

    @Override
    public int sizePila() {
        return this.getSize();
    }

    @Override
    public boolean esVacio() {
        if (this.getSize() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E getElementoTop() {
        E elemento;
        if (esVacio()) {
            elemento = null;
            System.out.println("La pila esta vacio");
        } else {
            elemento = this.top.getNodo();
        }

        return elemento;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the top
     */
    public Nodo getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(Nodo top) {
        this.top = top;
    }

}
