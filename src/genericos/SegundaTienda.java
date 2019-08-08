/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import proyectoAlmacen.*;

/**
 *
 * @author walte
 */
public class SegundaTienda {

    private String nombre;
    private Producto[] stock;

    public SegundaTienda(String nombre, Producto[] stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public SegundaTienda() {
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
     * @return the stock
     */
    public Producto[] getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Producto[] stock) {
        this.stock = stock;
    }
    public void aplicarDescuento(){
        double descuento = 0.0;
        for (Producto producto : this.getStock()) {
            descuento = producto.getPrecio() * 0.05;
            producto.setPrecio(producto.getPrecio()-descuento);
        }
    }

    public void imprimirEstadisticaSegundaTienda() {
        aplicarDescuento();
        double beneficioTotal = 0.0;
        for (Producto producto : this.getStock()) {
            beneficioTotal += producto.getPrecio();
            System.out.println(producto.imprimirProducto());
        }
        System.out.println("Beneficio Total: " + beneficioTotal);
    }
}
