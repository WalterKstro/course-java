/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraArbolGenericoNodo;

import excepcionesArbolGenerico.ExcepcionesArbolVacio;
import estructuraTemplateArbolGenerico.Position;
import estructuraTemplateArbolGenerico.TemplateArbol;
import excepcionesArbolGenerico.ExcepcionInvalidPosition;
import excepcionesArbolGenerico.ExcepcionNodoHoja;
import excepcionesArbolGenerico.ExcepcionNullPadre;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author walte
 */
public class ArbolGenerico<E> implements TemplateArbol<E> {

    private Nodo<E> root;
    private int size;

    public ArbolGenerico(Nodo<E> root, int size) {
        this.root = root;
        this.size = size;
    }

    public ArbolGenerico() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
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
    public Iterator iterator() {
        Iterable<Position<E>> positions = (Iterable<Position<E>>) iterator();
        ArrayList<Position<E>> resulado = new ArrayList<>();
        for (Position<E> position : positions) {
            resulado.add(position);
        }
        return resulado.iterator();
    }

    @Override
    public Iterable<Position<E>> iterable() {
        ArrayList<Position<E>> listado = new ArrayList<>();
        preOrden(root, listado);
        return (Iterable) listado;
    }

    @Override
    public Position<E> root() throws ExcepcionesArbolVacio {
        if (root == null) {
            throw new ExcepcionesArbolVacio("El arbol esta vacio");
        } else {
            return (Position<E>) root;
        }
    }

    @Override
    public Position<E> parent(Position<E> position) throws ExcepcionNullPadre {
        Nodo<E> nodo = convertirPositionANodo(position);
        Nodo<E> nodoPadre = nodo.getNodoPadre();
        if (nodoPadre == null) {
            throw new ExcepcionNullPadre("Nodo no tiene padre");
        } else {
            return (Position<E>) nodoPadre;
        }
    }

    @Override
    public Iterable children(Position<E> position) throws ExcepcionNodoHoja {
        Iterable<E> hijos = null;
        Nodo<E> nodo = convertirPositionANodo(position);
        if ((nodo.getListadoHijos().isEmpty())) {
            throw new ExcepcionNodoHoja("Nodo hoja: no tiene hijos");
        } else {
            hijos = (Iterable<E>) nodo.getListadoHijos();
        }
        return hijos;
    }

    @Override
    public boolean isLeaf(Position<E> position) {
        Nodo<E> nodo = convertirPositionANodo(position);
        ArrayList<Nodo<E>> hijos = nodo.getListadoHijos();
        if ((hijos.size() == 0) || (hijos.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isInternal(Position<E> position) {
        return !isLeaf(position);
    }

    @Override
    public boolean isRoot(Position<E> position) {
        Nodo<E> nodo = convertirPositionANodo(position);
        if (nodo == root) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E replace(Position<E> position, E elemento) {
        Nodo<E> nodo = convertirPositionANodo(position);
        E e = nodo.getElement();
        nodo.setElemento(elemento);
        return e;
    }

    /**
     * Funcion que agrega un nodo hijo a determinado nodo padre
     *
     * @param padre
     * @param e
     * @return
     */
    public Position<E> addNodoHijo(Position<E> padre, E e) {
        Nodo<E> nodoPadre = convertirPositionANodo(padre);
        Nodo<E> nodoHijo = crearNodo(nodoPadre, e, new ArrayList<>());
        ArrayList<Nodo<E>> nodoHijos = nodoPadre.getListadoHijos();
        nodoHijos.add(nodoHijo);
        setSize(++size);
        return (Position<E>) nodoHijo;
    }

    /**
     * Funcion que agrega el nodo root al arbol generico
     *
     * @param elemento
     * @return
     */
    public Position<E> addNodoRoot(E elemento) {
        Nodo<E> root = crearNodo(null, elemento, new ArrayList<>());
        setRoot(root);
        setSize(++size);
        return (Position<E>) root;
    }

    public Position<E> removeNodo(Position<E> nodo) throws ExcepcionInvalidPosition {
        Nodo<E> nodoRemove = convertirPositionANodo(nodo);
        Nodo<E> padre = nodoRemove.getNodoPadre();
        ArrayList<Nodo<E>> listado = padre.getListadoHijos();
        listado.remove(nodo);

        ArrayList<Position<E>> list = new ArrayList<>();
        preOrden(nodo, list);
        size-=list.size();
        return (Position<E>) nodoRemove;
    }

    /**
     * Funcion que recorre el arbon en preOrden root,izquierda,derecha
     *
     * @param initNodo
     * @return
     */
    public void preOrden(Position<E> initNodo, ArrayList<Position<E>> listado) {
        listado.add(initNodo);
        Nodo<E> nodo = convertirPositionANodo(initNodo);
        if (!isLeaf(initNodo
        )) {
            for (Position<E> hijos : nodo.getListadoHijos()) {
                preOrden(hijos, listado);
            }
        }
    }

    /**
     * @return the root
     */
    public Nodo<E> getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Nodo<E> root) {
        this.root = root;
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
     * Convierte un position a un Nodo
     *
     * @param position
     * @return
     * @throws ExcepcionInvalidPosition
     */
    protected Nodo<E> convertirPositionANodo(Position<E> position) throws ExcepcionInvalidPosition {
        if ((position == null) || !(position instanceof Nodo)) {
            throw new ExcepcionInvalidPosition("La posicion es invalida");
        } else {
            Nodo<E> nodo = (Nodo<E>) position;
            return nodo;
        }
    }

    protected Nodo<E> crearNodo(Nodo<E> padre, E e, ArrayList<Nodo<E>> hijos) {
        Nodo<E> nodo = new Nodo(e, padre, hijos);
        return nodo;
    }

}
