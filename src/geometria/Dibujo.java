/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author walte
 */
public class Dibujo extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        //DIBUJAR LA BASE
        Poligono base = new Poligono();
        Poligono techo = new Poligono();
        
        int[] coordenadasX = {150, 220, 220, 150};
        int[] coordenadasY = {260, 260, 200, 200};
        
        base.setNpuntos(4);
        base.setXcoordenadas(coordenadasX);
        base.setYcoordenadas(coordenadasY);
        
        g.setColor(Color.red);        
        g.fillPolygon(base.prepararPoligono());
        //DIBUJAR EL TECHO
          
        int[] coordenadasXtecho = {130, 240, 185};
        int[] coordenadasYtecho = {200, 200, 160};
        
        techo.setNpuntos(3);
        techo.setXcoordenadas(coordenadasXtecho);
        techo.setYcoordenadas(coordenadasYtecho);
        
        g.setColor(Color.red);        
        g.fillPolygon(techo.prepararPoligono());
        
        //SOL
        Circulo sol = new Circulo();
        sol.setAlto(50);
        sol.setAncho(50);
        sol.setcX(300);
        sol.setcY(100);
        g.setColor(Color.YELLOW);
        g.fillOval(sol.getcX(), sol.getcY(), sol.getAlto(), sol.getAncho());
        
        //SUELO
        Recta suelo = new Recta();
        suelo.setPini(new Punto(0, 260));
        suelo.setPfn(new Punto(400, 260));
        g.setColor(Color.GREEN);
        g.drawLine(suelo.getPini().getPx(), suelo.getPini().getPy(), suelo.getPfn().getPx(), suelo.getPfn().getPy());
       
    }
}
