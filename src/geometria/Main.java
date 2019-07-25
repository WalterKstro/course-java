/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import javax.swing.JFrame;

/**
 *
 * @author walte
 */
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Figuras geometricas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(400, 400);
        Dibujo dibujo = new Dibujo();
        ventana.add(dibujo);
    }
}
