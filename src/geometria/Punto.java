/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author walte
 */
public class Punto {

    private int px;
    private int py;

    public Punto(){}
    public Punto(int px, int py) {
        this.px = px;
        this.py = py;
    }

    /**
     * @return the px
     */
    public int getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(int px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public int getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(int py) {
        this.py = py;
    }
}
