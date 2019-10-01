/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraListas;

import java.util.ArrayList;

/**
 *
 * @author walte
 */
public class Listas<E> implements MetodosInterfaz<E> {

    private Nodo<E> nodoFirst;
    private Nodo<E> nodoLast;
    private int size;

    public Listas() {
        this.nodoFirst = null;
        this.nodoLast = null;
        this.size = 0;
    }

    @Override
    public void addFirst(E e) {
        Nodo<E> nodo;
        if (isEmpty()) {
            nodo = new Nodo<E>();
            nodo.setElemento(e);
            nodo.setPrev(null);
            nodo.setNext(null);
            setNodoFirst(nodo);
            setNodoLast(nodo);
            setSize(++size);
        } else {
            nodo = new Nodo<E>();
            nodo.setElemento(e);
            nodo.setPrev(null);
            nodo.setNext(nodoFirst);
            nodoFirst.setPrev(nodo);
            setNodoFirst(nodo);
            setSize(++size);
        }
    }

    @Override
    public void addLast(E e) {
        Nodo<E> nodo;
        if (isEmpty()) {
            nodo = new Nodo<>();
            nodo.setElemento(e);
            nodo.setPrev(null);
            nodo.setNext(null);
            setNodoFirst(nodo);
            setNodoLast(nodo);
            setSize(++size);
        } else {
            nodo = new Nodo<>();
            nodo.setElemento(e);
            nodo.setNext(null);
            nodo.setPrev(nodoLast);
            nodoLast.setNext(nodo);
            setNodoLast(nodo);
            setSize(++size);
        }
    }

    @Override
    public void add(E e, int posicion) {
        Listas<E> tempLista = null;
        if (isEmpty()) {
            System.out.println("Lista esta vacia");
        } else if (posicion == 0) {
            addFirst(e);
        } else if (posicion == getSize() - 1) {
            addLast(e);
        } else if (posicion > getSize() - 1) {
            System.out.println("Error: desborde del indice");
        } else {
            tempLista = new Listas<>();
            int contador = 0;
            while (isEmpty() == false) {
                if (contador == posicion) {
                    tempLista.addLast(e);
                    contador++;
                } else {
                    tempLista.addLast(getFirst());
                    removeFirst();
                    contador++;
                }
            }
            setNodoFirst(tempLista.getNodoFirst());
            setNodoLast(tempLista.getNodoLast());
            setSize(tempLista.getSize());
        }
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("No hay elementos que remover");
        } else {
            setNodoFirst(nodoFirst.getNext());
            setSize(--size);
        }
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("No hay elementos que remover");
        } else {
            setNodoLast(nodoLast.getPrev());
            nodoLast.setNext(null);
            setSize(--size);
        }
    }

    @Override
    public void remove(int posicion) {

        if (isEmpty()) {
            System.out.println("Lista esta vacia");
        } else if (posicion == 0) {
            removeFirst();
        } else if (posicion == getSize() - 1) {
            removeLast();
        } else if (posicion > getSize() - 1) {
            System.out.println("Error: desborde del indice");
        } else {
            Listas<E> tempLista = new Listas<>();
            int contador = 0;
            while (this.isEmpty() == false) {
                if (posicion == contador) {
                    this.removeFirst();
                    contador++;
                } else {
                    tempLista.addLast(getFirst());
                    this.removeFirst();
                    contador++;
                }
            }
            setNodoFirst(tempLista.getNodoFirst());
            setNodoLast(tempLista.getNodoLast());
            setSize(tempLista.getSize());
        }
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E getFirst() {
        E elemento;
        if (isEmpty()) {
            elemento = null;
            System.out.println("No hay elementos");
        } else {
            elemento = nodoFirst.getElemento();
        }

        return elemento;
    }

    @Override
    public E getLast() {
        E elemento;
        if (isEmpty()) {
            elemento = null;
            System.out.println("No hay elementos");
        } else {
            elemento = nodoLast.getElemento();
        }
        return elemento;
    }

    @Override
    public E getIndex(int posicion) {
        E elemento = null;
        if (posicion == 0) {
            elemento = getFirst();
        } else if (posicion == getSize() - 1) {
            elemento = getLast();
        } else if (posicion > getSize() - 1) {
            System.out.println("Error:Desborde del indice");
        } else {
            Listas<E> tempLista = new Listas<>();
            int contador = 0;
            boolean encontrado = false;
            while (this.isEmpty() == false) {
                if (posicion == contador) {
                    elemento = getFirst();
                    tempLista.addLast(getFirst());
                    this.removeFirst();
                    encontrado = true;
                    contador++;
                } else {
                    tempLista.addLast(getFirst());
                    this.removeFirst();
                    contador++;
                }
            }
            setNodoFirst(tempLista.getNodoFirst());
            setNodoLast(tempLista.getNodoLast());
            setSize(tempLista.getSize());
        }
        return elemento;
    }
    
    public Iterable<Nodo<E>> iterator(){
        Listas<E> listTemp = new Listas<>();
        ArrayList<Nodo<E>> listadoArray = new ArrayList<>();
        while (isEmpty() == false) { 
            Nodo<E> nodo = new Nodo();
            nodo = nodoFirst;            
            listadoArray.add(nodo);
            listTemp.addLast(getFirst());
            removeFirst();
        }
        nodoFirst = listTemp.getNodoFirst();
        nodoLast = listTemp.getNodoLast();
        size = listTemp.getSize();
      
        return listadoArray;
    }

    @Override
    public boolean contain(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nodoFirst
     */
    public Nodo<E> getNodoFirst() {
        return nodoFirst;
    }

    /**
     * @param nodoFirst the nodoFirst to set
     */
    public void setNodoFirst(Nodo<E> nodoFirst) {
        this.nodoFirst = nodoFirst;
    }

    /**
     * @return the nodoLast
     */
    public Nodo<E> getNodoLast() {
        return nodoLast;
    }

    /**
     * @param nodoLast the nodoLast to set
     */
    public void setNodoLast(Nodo<E> nodoLast) {
        this.nodoLast = nodoLast;
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

}
