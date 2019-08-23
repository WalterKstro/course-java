/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoEncuestaInterfaz;


/**
 *
 * @author walte
 */
public class Encuesta {
    private String color;
    private String animal;
    private String comida;
    private String lugar;
    private boolean suscripcion;
    private String juego;

    public Encuesta(String color, String animal, String comida, String lugar, boolean suscripcion, String juego) {
        this.color = color;
        this.animal = animal;
        this.comida = comida;
        this.lugar = lugar;
        this.suscripcion = suscripcion;
        this.juego = juego;
    }

    
    public Encuesta(){}

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the animal
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    /**
     * @return the comida
     */
    public String getComida() {
        return comida;
    }

    /**
     * @param comida the comida to set
     */
    public void setComida(String comida) {
        this.comida = comida;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the suscripcion
     */
    public boolean getSuscripcion() {
        return suscripcion;
    }

    /**
     * @param suscripcion the suscripcion to set
     */
    public void setSuscripcion(boolean suscripcion) {
        this.suscripcion = suscripcion;
    }

    /**
     * @return the juego
     */
    public String getJuego() {
        return juego;
    }

    /**
     * @param juego the juego to set
     */
    public void setJuego(String juego) {
        this.juego = juego;
    }

    @Override
    public String toString() {
        return "Encuesta{" + "color=" + color + ", animal=" + animal + ", comida=" + comida + ", lugar=" + lugar + ", suscripcion=" + suscripcion + ", juego=" + juego + '}';
    }
}
