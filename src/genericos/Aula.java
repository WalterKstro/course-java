/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import proyectoColegio.*;
import java.util.Arrays;

/**
 *
 * @author walte
 */
public class Aula {

    private Alumno[] alumnos;
    private Profesor profesor;
    private String seccion;
    private String grado;

    public Aula(Alumno[] alumnos, Profesor profesor, String seccion, String grado) {
        this.alumnos = alumnos;
        this.profesor = profesor;
        this.seccion = seccion;
        this.grado = grado;
    }

    public Aula() {
    }

    /**
     * @return the alumnos
     */
    public Alumno[] getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the seccion
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    /**
     * @return the grado
     */
    public String getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(String grado) {
        this.grado = grado;
    }

    public double calcularPromedioSeccion() {
        double promedio = 0;
        double valoracionCoordinador = 0;
        for (int i = 0; i < this.getAlumnos().length; i++) {
            promedio += this.getAlumnos()[i].getPromedio();
            if (this.getAlumnos()[i] instanceof Coordinador) {
                valoracionCoordinador += this.getAlumnos()[i].getPromedio() * 0.10;
            }
        }
        return Math.round(((promedio / this.getAlumnos().length) + valoracionCoordinador));
    }

    public void imprimirAlumnos() {
        for (Alumno alumno : this.getAlumnos()) {
            System.out.println(alumno.imprimirInformacionAlumno());
        }
    }

    public Alumno mejorAlumno() {
        Alumno mejorAlumno = null;
        double mejorNota = 0.0;
        for (int i = 0; i < this.getAlumnos().length; i++) {

            if (this.getAlumnos()[i].getPromedio() > mejorNota) {
                mejorAlumno = this.getAlumnos()[i];
                mejorNota = this.getAlumnos()[i].getPromedio();
            }
        }
        return mejorAlumno;
    }

}
