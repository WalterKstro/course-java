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
public interface MetodosInterfaz<E> {
    public int getSize();
    public boolean isEmpty();
    public E getFront();
    public void setElement(E e);
    public void deleteElement();
    public E getBack();
}
