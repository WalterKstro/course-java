/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoLibreria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author walte
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = GeneraitorBooks.generaitorBooks(30);
        BookStore BookStoreU = new BookStore(list, "BookStore U");
        
        /**
         * Listar y crear reporte en un archivo txt
         * los libros disponibles en la libreria
         */
        Scanner keyboard = new Scanner(System.in);
        int optionSelected = 6;
        while (optionSelected != 0) {            
            menu();
            try{
             System.out.print("Ingrese su opcion: ");
            optionSelected = keyboard.nextInt();   
            }catch(InputMismatchException input){
                    
                System.out.println("Error: valor no es valido: " + input.getMessage());
                
                optionSelected = 0;
            }
            
            switch(optionSelected){
                case 1 -> BookStoreU.addBook();
                case 2 -> BookStoreU.deleteBookInBookStore();
                case 3 -> BookStoreU.filterByAuthor();
                case 4 -> BookStoreU.filterByPrice();
                case 5 -> BookStoreU.printBookStore(list);
                case 0 -> optionSelected = 0;
            }
            
        }
        
        
    }
    public static void menu(){
        System.out.println("**********************************");
        System.out.println(" 1 -> Añadir Libro ");
        System.out.println(" 2 -> Borrar Libro ");
        System.out.println(" 3 -> Buscar Libro por Autor ");
        System.out.println(" 4 -> Buscar Libro por Precio ");
        System.out.println(" 5 -> Imprimir Catalogo ");
        System.out.println(" 0 -> Salir ");
        System.out.println("**********************************");
    }
}
