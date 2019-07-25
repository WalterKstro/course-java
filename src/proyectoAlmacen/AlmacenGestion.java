/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoAlmacen;

import java.util.ArrayList;

/**
 *
 * @author walte
 */
public class AlmacenGestion {

    private Producto[] almacen;

    public AlmacenGestion() {
    }

    public AlmacenGestion(Producto[] almacen) {
        this.almacen = almacen;
    }

    /**
     * @return the almacen
     */
    public Producto[] getAlmacen() {
        return almacen;
    }

    /**
     * @param almacen the almacen to set
     */
    public void setAlmacen(Producto[] almacen) {
        this.almacen = almacen;
    }

    public void ordenacionAlmacen(Producto[] almacen) {
        Producto auxiliar;
        for (int i = 0; i < almacen.length - 1; i++) {
            for (int j = 0; j < almacen.length - 1; j++) {
                if (almacen[j].getPrecio() > almacen[j + 1].getPrecio()) {
                    auxiliar = almacen[j];
                    almacen[j] = almacen[j + 1];
                    almacen[j + 1] = auxiliar;
                }
            }
        }
    }

    public Producto buscarProductoOrdenado(Producto[] almacen, String id) {
        boolean encontrado = false;
        Producto producto = null;
        int indice = 0;
        while ((encontrado == false) && (indice < almacen.length)) {
            if (almacen[indice].getId().equals(id)) {
                encontrado = true;
                producto = almacen[indice];
            }

            indice++;
        }
        return producto;
    }

    public void imprimirAlmacen() {
        for (Producto producto : almacen) {
            System.out.println(producto.imprimirProducto());
        }
    }

    public Producto[] gestionarTiendaA(int n) {
        this.ordenacionAlmacen(this.getAlmacen());
        ArrayList<Producto> pedido = new ArrayList<>();
        int contador = 0;
        int recorrido = this.getAlmacen().length - 1;
        while ((recorrido > 0) && (contador < n)) {
            if (almacen[recorrido].getClase().equals("X")) {
                almacen[recorrido].setClase("A");
                almacen[recorrido].setAsignado(true);
                pedido.add(almacen[recorrido]);
                contador++;
            }
            recorrido--;
        }
        Producto[] productosTiendaA = pedido.toArray(new Producto[pedido.size()]);
        return productosTiendaA;
    }
    
    
       public Producto[] gestionarTiendaB(int n) {
        this.ordenacionAlmacen(this.getAlmacen());
        ArrayList<Producto> pedido = new ArrayList<>();
        int contador = 0;
        int recorrido = this.getAlmacen().length - 1;
        while ((recorrido > 0) && (contador < n)) {
            if (almacen[recorrido].isAsignado() != true) {
                almacen[recorrido].setClase("B");
                almacen[recorrido].setAsignado(true);
                pedido.add(almacen[recorrido]);
                contador++;
            }
            recorrido--;
        }
        Producto[] productosTiendaB = pedido.toArray(new Producto[pedido.size()]);
        return productosTiendaB;
    }
    

}
