/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoAlmacen;

/**
 *
 * @author walte
 */
public class Main {

    public static void main(String[] args) {
        Producto[] mainAlmacen = GeneradorProductos.generarProductos(20);
        


        AlmacenGestion bodegaPrincipal = new AlmacenGestion(mainAlmacen);
        bodegaPrincipal.ordenacionAlmacen(mainAlmacen);
        System.out.println("******************************PRODUCTOS BODEGA PRINCIPAL*************************************");
        bodegaPrincipal.imprimirAlmacen();
        System.out.println("");
        
       
        
        
        
        
//
//        System.out.println("******************************RESULTADOS BUSQUEDA********************************************");
//        try {
//            System.out.println(bodegaPrincipal.buscarProductoOrdenado(almacen, "MSD").imprimirProducto());
//        } catch (NullPointerException message) {
//            System.out.println("Producto = " + message.getMessage() + " no existe");
//        }
//        System.out.println("");
//
        System.out.println("******************************PRIMERA TIENDA********************************************");
        PrimeraTienda tiendaA = new PrimeraTienda("La Bodegaona",  bodegaPrincipal.gestionarTiendaA(8));
        tiendaA.imprimirEstadisticaPrimeraTienda();
        tiendaA.generarReporte();
        
        System.out.println("");

        System.out.println("******************************SEGUNDA TIENDA********************************************");
        SegundaTienda tiendaB = new SegundaTienda("Cemaco",bodegaPrincipal.gestionarTiendaB(10));
        tiendaB.imprimirEstadisticaSegundaTienda();
        

    }
}
