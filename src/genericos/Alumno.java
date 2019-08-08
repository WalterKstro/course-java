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
public class Alumno extends Persona{
    private String curso;
    private double promedio;

    public Alumno(String curso, double promedio, String nombre, String apellido, int dpi) {
        super(nombre, apellido, dpi);
        this.curso = curso;
        this.promedio = promedio;
    }

    public Alumno(String curso, double promedio) {
        this.curso = curso;
        this.promedio = promedio;
    }
    public Alumno(){}

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public String imprimirInformacionAlumno(){
        return  "Curso: " + this.getCurso() + ", Promedio: " + this.getPromedio() + ", "+ super.imprimirInformacionPersona();
    }
    
}
