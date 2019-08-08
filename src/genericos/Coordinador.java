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
public class Coordinador extends Alumno{
    private int valoracion;

    public Coordinador(int valoracion, String curso, double promedio, String nombre, String apellido, int dpi) {
        super(curso, promedio, nombre, apellido, dpi);
        this.valoracion = valoracion;
    }

    public Coordinador(int valoracion, String curso, double promedio) {
        super(curso, promedio);
        this.valoracion = valoracion;
    }

    public Coordinador(int valoracion) {
        this.valoracion = valoracion;
    }
    public Coordinador(){}

    /**
     * @return the valoracion
     */
    public int getValoracion() {
        return valoracion;
    }

    /**
     * @param valoracion the valoracion to set
     */
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    
    public String imprimirInformacionCoordinador(){
        return super.imprimirInformacionAlumno() + "Valoracion: " + this.getValoracion();
    }
}
