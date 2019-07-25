/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statico;

/**
 *
 * @author walte
 */
public class Plataforma {
    private String nombre;
    private double fondosPropios;
    private static double fondosGlobales;

    public Plataforma(String nombre){
        this.nombre = nombre;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fondosPropios
     */
    public double getFondosPropios() {
        return fondosPropios;
    }

    /**
     * @param fondosPropios the fondosPropios to set
     */
    public void setFondosPropios(double fondosPropios) {
        this.fondosPropios = fondosPropios;
        fondosGlobales = fondosGlobales - fondosPropios;
    }

    /**
     * @return the fondosGlobales
     */
    public static double getFondosGlobales() {
        return fondosGlobales;
    }

    /**
     * @param aFondosGlobales the fondosGlobales to set
     */
    public static void setFondosGlobales(double aFondosGlobales) {
        fondosGlobales += aFondosGlobales;
    }
    
    public static void getFondosTotales(){
        System.out.println("Dinero total: "+ fondosGlobales);
    }
    
}
