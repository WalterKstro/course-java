/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author walte
 */
public class Profesor extends Persona{
    private String especialidad;
    private double salario;

    public Profesor(String especialidad, double salario, String nombre, String apellido, int dpi) {
        super(nombre, apellido, dpi);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Profesor(String especialidad, double salario) {
        this.especialidad = especialidad;
        this.salario = salario;
    }
    public Profesor(){}

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

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
    
    public String imprimirInformacionProfesor(){
        return "Especialidad: " + this.getEspecialidad() + ", Salario: " + this.getSalario() + ", " + super.imprimirInformacionPersona();
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + ", salario=" + salario + '}';
    }
    
}
