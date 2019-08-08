/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import proyectoColegio.*;

/**
 *
 * @author walte
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int dpi;

    public Persona(String nombre, String apellido, int dpi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
    }

    public Persona(){}
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dpi
     */
    public int getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String imprimirInformacionPersona() {
        return "Nombre: " + this.getNombre() + ", Apellido: " + this.getApellido() + ", Dpi: " + this.getDpi();
    }
    
    
}
