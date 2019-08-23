/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoEncuestaInterfaz;

/**
 *
 * @author walte
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String nick;
    private String password;
    private Fecha fecha;

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick + ", password=" + password + ", fecha=" + fecha + ", encuesta=" + encuesta + '}';
    }
    private Encuesta encuesta;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nick, String password, Fecha fecha, Encuesta encuesta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.password = password;
        this.fecha = fecha;
        this.encuesta = encuesta;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the encuesta
     */
    public Encuesta getEncuesta() {
        return encuesta;
    }

    /**
     * @param encuesta the encuesta to set
     */
    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }
}
