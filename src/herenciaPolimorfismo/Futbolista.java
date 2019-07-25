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
public class Futbolista extends Persona{
    private String posicion;
    private double valor;

    public Futbolista(String posicion, double valor, String nombre, String apellido, int edad, int contrato) {
        super(nombre, apellido, edad, contrato);
        this.posicion = posicion;
        this.valor = valor;
    }

    public Futbolista(String posicion, double valor) {
        this.posicion = posicion;
        this.valor = valor;
    }

    
    public Futbolista(){}

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String imprimitDatosFutbolista() {
        return super.imprimirInformacionPersona() + ", Posicion= " + posicion + ", Valor= " + valor;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "posicion=" + posicion + ", valor=" + valor + '}';
    }
    
}


// + ", Nombre= " + this.getApellido() + 
//               ", Apellido= " + this.getApellido() + ", Edad= " + this.getEdad() + ", Contrato= " + this.getContrato()