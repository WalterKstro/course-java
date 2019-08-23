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
public class Fecha {
    private String dia;
    private String mes;
    private String anho;

    public Fecha(String dia, String mes, String anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }
    public Fecha(){}

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the anho
     */
    public String getAnho() {
        return anho;
    }

    /**
     * @param anho the anho to set
     */
    public void setAnho(String anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return dia +"/"+ mes +"/"+ anho ;
    }
}
