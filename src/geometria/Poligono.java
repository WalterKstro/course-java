/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.awt.Polygon;

/**
 *
 * @author walte
 */
public class Poligono {

    private int npuntos;
    private int[] xcoordenadas;
    private int[] ycoordenadas;

    public Poligono(){}
    public Poligono(int[] xcoordenadas, int[] ycoordenadas, int npuntos) {
        this.npuntos = npuntos;
        this.xcoordenadas = xcoordenadas;
        this.ycoordenadas = ycoordenadas;
    }

    public Polygon prepararPoligono() {
        return new Polygon(this.getXcoordenadas(), this.getYcoordenadas(), this.getNpuntos());
    }

    /**
     * @return the npuntos
     */
    public int getNpuntos() {
        return npuntos;
    }

    /**
     * @param npuntos the npuntos to set
     */
    public void setNpuntos(int npuntos) {
        this.npuntos = npuntos;
    }

    /**
     * @return the xcoordenadas
     */
    public int[] getXcoordenadas() {
        return xcoordenadas;
    }

    /**
     * @param xcoordenadas the xcoordenadas to set
     */
    public void setXcoordenadas(int[] xcoordenadas) {
        this.xcoordenadas = xcoordenadas;
    }

    /**
     * @return the ycoordenadas
     */
    public int[] getYcoordenadas() {
        return ycoordenadas;
    }

    /**
     * @param ycoordenadas the ycoordenadas to set
     */
    public void setYcoordenadas(int[] ycoordenadas) {
        this.ycoordenadas = ycoordenadas;
    }

}
