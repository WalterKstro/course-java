/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;


import proyectoAlmacen.*;
import java.text.DecimalFormat;

/**
 *
 * @author walte
 */
public class Producto {

    private String id;
    private double precio;
    private double peso;
    private String nombre;
    private boolean asignado;
    private String clase;
    DecimalFormat formatoDecimal = new DecimalFormat("#.00");

    public Producto(String nombre, double precio, String id, double peso, boolean asignado, String clase) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.peso = peso;
        this.asignado = asignado;
        this.clase = clase;
    }

    public Producto() {
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
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the asignado
     */
    public boolean isAsignado() {
        return asignado;
    }

    /**
     * @param asignado the asignado to set
     */
    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    public String imprimirProducto() {
        return "nombre=" + this.getNombre() + ", precio=" + this.getPrecio() + ", id=" + this.getId() + ", peso=" + formatoDecimal.format(this.getPeso()) + ", "
                + "asignado=" + this.isAsignado() + ", clase=" + this.getClase();
    }

}
