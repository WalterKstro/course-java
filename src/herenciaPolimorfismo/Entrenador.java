/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaPolimorfismo;

/**
 *
 * @author walte
 */
public class Entrenador extends Persona{
    private int[] tactica;

    public Entrenador(int[] tactica, String nombre, String apellido, int edad, int contrato) {
        super(nombre, apellido, edad, contrato);
        this.tactica = tactica;
    }

    public Entrenador(int[] tactica) {
        this.tactica = tactica;
    }
    
    public Entrenador(){}

    /**
     * @return the tactica
     */
    public int[] getTactica() {
        return tactica;
    }

    /**
     * @param tactica the tactica to set
     */
    public void setTactica(int[] tactica) {
        this.tactica = tactica;
    }
    
}
