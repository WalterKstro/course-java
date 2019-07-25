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
public class Usuario {
    private String nombre;
    private double efectivoDonacion;
    private int idUsuario;
    private static int autoincrement;

    public Usuario(String nombre, double efectivoDonacion) {
        this.nombre = nombre;
        this.efectivoDonacion = efectivoDonacion;
        this.idUsuario = autoincrement++;
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
     * @return the efectivoDonacion
     */
    public double getEfectivoDonacion() {
        return efectivoDonacion;
    }

    /**
     * @param efectivoDonacion the efectivoDonacion to set
     */
    public void setEfectivoDonacion(double efectivoDonacion) {
        this.efectivoDonacion = efectivoDonacion;
    }
    public void donarEfectivoDonacion() {
        Plataforma.setFondosGlobales(this.getEfectivoDonacion());
        this.setEfectivoDonacion(0.0);
    }

    /**
     * @return the idUsuario
     */
    public  int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param aIdUsuario the idUsuario to set
     */
    public void setIdUsuario(int aIdUsuario) {
        idUsuario = aIdUsuario;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", efectivoDonacion=" + efectivoDonacion + ", idUsuario=" + idUsuario;
    }

    
    
}
