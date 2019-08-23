/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoEncuestaInterfaz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author walte
 */
public class Controlador {

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private Usuario usuarioSession;

    public Controlador() {
        this.usuarios = new ArrayList<>();
    }

    public Controlador(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;        
    }

    public boolean validarUsuario(String user, String pw) {
        Iterator<Usuario> listIterator = this.getUsuarios().iterator();
        boolean encontrado = false;
        try {
            while ((listIterator.hasNext()) && (encontrado == false)) {
                Usuario usuario = listIterator.next();
                if ((usuario.getNick().compareTo(user) == 0) && (usuario.getPassword().compareTo(pw) == 0)) {
                    encontrado = true;
                    this.setUsuarioSession(usuario);
                }
            }
        } catch (NoSuchElementException element) {
            System.out.println("No hay coincidencias " + element.getMessage());
        }

        return encontrado;
    }

    /**
     * @return the usuarios
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the usuarioSession
     */
    public Usuario getUsuarioSession() {
        return usuarioSession;
    }

    /**
     * @param usuarioSession the usuarioSession to set
     */
    public void setUsuarioSession(Usuario usuarioSession) {
        this.usuarioSession = usuarioSession;
    }

}
