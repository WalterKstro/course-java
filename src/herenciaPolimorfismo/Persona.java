/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaPolimorfismo;

/**
 *
 * @author walte
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
     private int contrato;

    public Persona(String nombre, String apellido, int edad, int contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.contrato = contrato;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the contrato
     */
    public int getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String imprimirInformacionPersona() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", contrato=" + contrato;
    }
    
    
}
