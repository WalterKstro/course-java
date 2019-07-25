/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoColegio;

/**
 *
 * @author walte
 */
public class Colegio {
    private Aula[] aulas;
    private String nombre;
    private Director director;

    public Colegio(Aula[] aulas, String nombre, Director director) {
        this.aulas = aulas;
        this.nombre = nombre;
        this.director = director;
    }

    public Colegio(){}
    /**
     * @return the aulas
     */
    public Aula[] getAulas() {
        return aulas;
    }

    /**
     * @param aulas the aulas to set
     */
    public void setAulas(Aula[] aulas) {
        this.aulas = aulas;
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
     * @return the director
     */
    public Director getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(Director director) {
        this.director = director;
    }
    public String imprimirInformacionColegio(){
        return "Cantidad de Aulas: " + this.getAulas().length + "Nombre: " + this.getNombre() + "Director: " + this.getDirector().getNombre();
    }
    public double calcularPromedioColegio(){
        double promedio = 0;
        for (int i = 0; i < this.getAulas().length; i++) {
            promedio+= this.getAulas()[i].calcularPromedioSeccion();
        }
        return Math.round(promedio / this.getAulas().length);
    }
    
    public Alumno mejorAlumnoColegio(){
        Alumno alumno = null;
        double mejorNotaColegio=0.0;
        for (int i = 0; i < this.getAulas().length; i++) {
            if (this.getAulas()[i].mejorAlumno().getPromedio() > mejorNotaColegio) {
                mejorNotaColegio = this.getAulas()[i].mejorAlumno().getPromedio();
                alumno = this.getAulas()[i].mejorAlumno();
            }
        }
        return alumno;
    }
    
}
