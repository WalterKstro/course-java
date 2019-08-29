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
public class Cola<E> implements MetodosInterfaz<E> {
    
    private Nodo<E> primerNodo;
    private Nodo<E> ultimoNodo;
    private int Size;
    
    public Cola() {
        this.Size = 0;
        this.primerNodo = null;
        this.ultimoNodo = null;
    }
    
    @Override
    public int getSize() {
        return this.Size;
    }
    
    @Override
    public boolean isEmpty() {
        if (this.getSize() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public E getFront() {
        E elemento;
        if (isEmpty()) {
            elemento = null;
            System.out.println("La cola esta vacio");
        } else {
            elemento = this.getPrimerNodo().getElemento();
        }
        return elemento;
    }
    
    @Override
    public void setElement(E e) {
        Nodo<E> nodo;
        if (isEmpty()) {
            nodo = new Nodo<E>();
            nodo.setElemento(e);
            nodo.setAnterior(null);
            nodo.setSiguiente(null);
            this.setPrimerNodo(nodo);
            this.setUltimoNodo(nodo);
            this.setSize(++Size);
        } else {
            nodo = new Nodo<E>();
            nodo.setElemento(e);
            nodo.setAnterior(null);
            nodo.setSiguiente(ultimoNodo);
            ultimoNodo.setAnterior(nodo);
            this.setUltimoNodo(nodo);
            this.setSize(++Size);
        }
    }
    
    @Override
    public void deleteElement() {
        if (isEmpty()) {
            System.out.println("La cola esta vacio");
        } else {
            primerNodo = primerNodo.getAnterior();
            primerNodo.setSiguiente(null);
            this.setSize(--Size);
        }
    }
    
    @Override
    public E getBack() {
        E elemento;
        if (isEmpty()) {
            elemento = null;
            System.out.println("La cola esta vacio");
        } else {
            elemento = this.getUltimoNodo().getElemento();
        }
        return elemento;
    }

    /**
     * @return the primerNodo
     */
    public Nodo<E> getPrimerNodo() {
        return primerNodo;
    }

    /**
     * @param primerNodo the primerNodo to set
     */
    public void setPrimerNodo(Nodo<E> primerNodo) {
        this.primerNodo = primerNodo;
    }

    /**
     * @return the ultimoNodo
     */
    public Nodo<E> getUltimoNodo() {
        return ultimoNodo;
    }

    /**
     * @param ultimoNodo the ultimoNodo to set
     */
    public void setUltimoNodo(Nodo<E> ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }
    
}
