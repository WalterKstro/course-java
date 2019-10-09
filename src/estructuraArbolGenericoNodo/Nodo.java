/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraArbolGenericoNodo;

import estructuraTemplateArbolGenerico.Position;
import java.util.ArrayList;

/**
 *
 * @author walte
 */
public class Nodo<E> implements Position<E> {

    private E elemento;
    private Nodo<E> nodoPadre;
    private ArrayList<Nodo<E>> listadoHijos;

    public Nodo(E elemento, Nodo<E> nodoPadre, ArrayList<Nodo<E>> listadoHijos) {
        this.elemento = elemento;
        this.nodoPadre = nodoPadre;
        this.listadoHijos = listadoHijos;
    }

    public Nodo() {}

    @Override
    public E getElement() {
        return getElemento();
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
     * @return the nodoPadre
     */
    public Nodo<E> getNodoPadre() {
        return nodoPadre;
    }

    /**
     * @param nodoPadre the nodoPadre to set
     */
    public void setNodoPadre(Nodo<E> nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    /**
     * @return the listadoHijos
     */
    public ArrayList<Nodo<E>> getListadoHijos() {
        return listadoHijos;
    }

    /**
     * @param listadoHijos the listadoHijos to set
     */
    public void setListadoHijos(ArrayList<Nodo<E>> listadoHijos) {
        this.listadoHijos = listadoHijos;
    }

}
