/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraTemplateArbolGenerico;

import java.util.Iterator;

/**
 *
 * @author walte
 */
public interface TemplateArbol<E>{
    /**
     * Retorna el tamaño del arbol
     * @return 
     */
    public int size();
    /**
     * Retorna un booleano. Determina si el arbol esta
     * vacio
     * @return 
     */
    public boolean isEmpty();
    /**
     * Retorna un set iterator con todos los 
     * elementos del arbol
     * @return 
     */
    public Iterator iterator();
    /**
     * Retorna una coleccion con todos los
     * nodos del arbol
     * @return 
     */
    public Iterable iterable();
    /**
     * Retorna el nodo raiz del arbol
     * @return 
     */
    public Position<E> root();
    /**
     * Devuelve el padre del nodo enviado como parametro
     * @param position
     * @return 
     */
    public Position<E> parent(Position<E> position);
    /**
     * Devuelve una coleccion con todos los 
     * hijos de un nodo
     * @param position
     * @return 
     */
    public Iterable children(Position<E> position);
    /**
     * Determina si el nodo es una hoja
     * @param position
     * @return 
     */
    public boolean isLeaf(Position<E> position);
    /**
     * Determina si el nodo es uno interno
     * @param position
     * @return 
     */
    public boolean isInternal(Position<E> position);
    /**
     * Determina si el nodo es la raiz
     * @param position
     * @return 
     */
    public boolean isRoot(Position<E> position);
    /**
     * Reemplaza el elemento del nodo
     * @param position
     * @param elemento
     * @return 
     */
    public E replace(Position<E> position, E elemento);
    
}
