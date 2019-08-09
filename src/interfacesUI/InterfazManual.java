/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author walte
 */
public class InterfazManual extends JFrame implements ActionListener{
    JLabel label;
    JButton btnAceptar;
    JButton btnCancel;
    JPanel panel;

    public InterfazManual() {
        label = new JLabel("Interfaces Graficas");
        btnAceptar = new JButton("Aceptar");
        btnCancel = new JButton("Cancelar");
        panel = new JPanel();
        
        panel.add(label);
        panel.add(btnAceptar);
        panel.add(btnCancel);
        this.add(panel);
        
        //ListenerObject listener = new ListenerObject();
        btnAceptar.addActionListener(this);
        btnCancel.addActionListener(this);
    }
    
    public static void main(String[] args) {
        InterfazManual interfaz = new InterfazManual();
        interfaz.setTitle("Ventana de Java");
        interfaz.setSize(500, 200);
        interfaz.setVisible(true);
        
    }
    
    
//    class ListenerObject implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            JButton btn = (JButton) e.getSource();
//            label.setText(btn.getText());
//        }
//        
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        label.setText(btn.getText());
    }
    
    
}
