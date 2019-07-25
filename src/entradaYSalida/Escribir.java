/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaYSalida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author walte
 */
public class Escribir {

    public static void escribirArchivo() {
        String archivo = "escritura.txt";
        FileWriter fileWritter = null;
        try {
            fileWritter = new FileWriter(archivo);
            fileWritter.write("Primera linea\n");
            fileWritter.write("Segunda linea\n");
            fileWritter.close();
        } catch (IOException ex) {
            System.out.println("ERROR: escritura " + ex.getMessage());
        }
    }

    public static void leerArchivo() {
        String archivo = "escritura.txt";
        FileReader reader = null;
        int caracter;
        try {
            reader = new FileReader(archivo);
            caracter = reader.read();
            while (caracter != -1) {
                System.out.print((char) caracter);
                caracter = reader.read();
            }
            reader.close();
        } catch (IOException exception) {
            System.out.println("ERROR: lectura" + exception.getMessage());
        }
    }

    public static void filtroBuffeReader() {
        String archivo = "escritura.txt";
        FileReader reader = null;
        try {
            reader = new FileReader(archivo);
            BufferedReader buffeReader = new BufferedReader(reader);
            String linea = buffeReader.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = buffeReader.readLine();
            }
            buffeReader.close();
        } catch (IOException e) {
            System.out.println("Error: lectura" + e.getMessage());
        }
    }
}
