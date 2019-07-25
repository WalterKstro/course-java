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
public class Circulo {

    private int cX;
    private int cY;
    private int ancho;
    private int alto;

    public Circulo() {
    }

    public Circulo(int cX, int cY, int ancho, int alto) {
        this.cX = cX;
        this.cY = cY;
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * @return the cX
     */
    public int getcX() {
        return cX;
    }

    /**
     * @param cX the cX to set
     */
    public void setcX(int cX) {
        this.cX = cX;
    }

    /**
     * @return the cY
     */
    public int getcY() {
        return cY;
    }

    /**
     * @param cY the cY to set
     */
    public void setcY(int cY) {
        this.cY = cY;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

}
