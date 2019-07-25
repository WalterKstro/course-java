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
public class Recta {

    private Punto pini;
    private Punto pfn;

    public Recta(){}
    public Recta(Punto pini, Punto pfn) {
        this.pini = pini;
        this.pfn = pfn;
    }

    /**
     * @return the pini
     */
    public Punto getPini() {
        return pini;
    }

    /**
     * @param pini the pini to set
     */
    public void setPini(Punto pini) {
        this.pini = pini;
    }

    /**
     * @return the pfn
     */
    public Punto getPfn() {
        return pfn;
    }

    /**
     * @param pfn the pfn to set
     */
    public void setPfn(Punto pfn) {
        this.pfn = pfn;
    }
}
