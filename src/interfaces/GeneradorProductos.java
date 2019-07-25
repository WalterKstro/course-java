/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author walte
 */
public class GeneradorProductos {

    public static ArrayList<Producto> generarProductos(int cantidad) {
        ArrayList<Producto>  listado= new ArrayList<>();
        Producto producto = null;
        DecimalFormat formatoDecimal = new DecimalFormat("#.00");
        Random random = new Random();
        String[] nombres = {"Mouse Compaq", "Kingston RAM", "Monitor Samsung", "Laptop Toshiba", "Micro-SD", "Disco Duro"};
        
        for (int i = 0; i < cantidad; i++) {
            producto = new Producto();
            producto.setId(Integer.toString((int) (Math.random()*100000)));
            producto.setValor(Double.parseDouble(formatoDecimal.format(random.nextDouble() * 10000)));
            listado.add(producto);
        }
       return listado;
    }
}
