/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoAlmacen;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author walte
 */
public class GeneradorProductos {

    public static Producto[] generarProductos(int cantidad) {
        DecimalFormat formatoDecimal = new DecimalFormat("#.00");
        Random random = new Random();
        String[] nombres = {"Mouse Compaq", "Kingston RAM", "Monitor Samsung", "Laptop Toshiba", "Micro-SD", "Disco Duro"};
        Producto[] productosGenerados = new Producto[cantidad];
        for (int i = 0; i < cantidad; i++) {
            Producto producto = new Producto();
            producto.setId(Integer.toString((int) (Math.random()*100000)));
            producto.setPrecio(Double.parseDouble(formatoDecimal.format(random.nextDouble() * 10000)));
            producto.setPeso(random.nextDouble() * 10);
            producto.setAsignado(false);
            producto.setClase("X");
            producto.setNombre(nombres[random.nextInt(nombres.length - 1)]);
            productosGenerados[i] = producto;
        }
        return productosGenerados;
    }
}
