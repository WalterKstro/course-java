/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoEncuestaInterfaz;

import java.util.ArrayList;

/**
 *
 * @author walte
 */
public class Main {
    public static void main(String[] args) {
        Encuesta encuesta = new Encuesta("Azul", "Perro", "Estofado", "Antigua Guatemala", true, "FreeFire");
        Usuario usuario = new Usuario("Walter", "Francisco", "@walter", "123", new Fecha("21", "10", "1991"), encuesta);
        ArrayList<Usuario> listadoUsuarios = new ArrayList<>();
        listadoUsuarios.add(usuario);
        
        Controlador control = new Controlador(listadoUsuarios);
        
        Login login = new Login();
        login.setVisible(true);
        login.setControlador(control);
        
    }
}
