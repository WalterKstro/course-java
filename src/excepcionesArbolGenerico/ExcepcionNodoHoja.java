/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesArbolGenerico;

/**
 *
 * @author walte
 */
public class ExcepcionNodoHoja extends RuntimeException{
    public ExcepcionNodoHoja(String msg){
        super(msg);
    }
}
