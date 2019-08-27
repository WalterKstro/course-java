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
public interface InterfaceStack<E> {
    public void agregarElemento(E e);
    public void eliminarElemento();
    public int sizePila();
    public boolean esVacio();
    public E getElementoTop();
}
