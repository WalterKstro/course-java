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
public class Director extends Persona{
    private double salario;
    private String email;
    private int valoracion;

    public Director(double salario, String email,int valoracion, String nombre, String apellido, int dpi) {
        super(nombre, apellido, dpi);
        this.salario = salario;
        this.email = email;
        this.valoracion = valoracion;
    }

    public Director(double salario, String email, int valoracion) {
        this.salario = salario;
        this.email = email;
        this.valoracion = valoracion;
    }
    public Director(){}

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String imprimirInformacionDirector(){
        return "Salario: " + this.getSalario() + ", Correo: "+ this.getEmail() + ", Valoracion: "+ this.getValoracion() + ", " + super.imprimirInformacionPersona();
    }

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
}
