/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoAlmacen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author walte
 */
public class PrimeraTienda {

    private String nombre;
    private Producto[] stock;
    private double beneficioTotal;

    public PrimeraTienda(String nombre, Producto[] stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public PrimeraTienda() {
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

    public void imprimirEstadisticaPrimeraTienda() {
        beneficioTotal = 0.0;
        for (Producto producto : this.getStock()) {
            beneficioTotal += producto.getPrecio();
            System.out.println(producto.imprimirProducto());
        }
        System.out.println("Beneficio Total: " + beneficioTotal);
    }

    public void generarReporte() {
        String reporteTXT = "reporte.txt";
        FileWriter escritura = null;
        PrintWriter print = null;
        try {
            escritura = new FileWriter(reporteTXT);
            print = new PrintWriter(escritura);
            for (Producto producto : this.getStock()) {
                print.println(producto.imprimirProducto());
            }
            print.println("Beneficio Total: " + beneficioTotal);
        } catch (IOException e) {
            System.out.println("ERROR: escritura" + e.getMessage());
        } finally {
            print.close();
        }

    }
}
