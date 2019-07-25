/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author walte
 */
public class Producto implements ProductoInterfaz{
    private String id;
    private double valor;

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

    @Override
    public void getIdentificador() {
        System.out.println("ID: " + this.getId());
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio: " + this.getValor());
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Producto = " + "id=" + this.getId() + ", valor=" + this.getValor()); 
    }


}
