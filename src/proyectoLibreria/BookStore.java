/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoLibreria;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author walte
 */
public class BookStore extends Utilities {

    private ArrayList<Book> bookStore;
    private String name;

    public BookStore(ArrayList<Book> books, String name) {
        this.bookStore = books;
        this.name = name;
    }

    public BookStore() {
    }

    /**
     * @return the bookStore
     */
    public ArrayList<Book> getBookStore() {
        return bookStore;
    }

    /**
     * @param bookStore the bookStore to set
     */
    public void setBookStore(ArrayList<Book> bookStore) {
        this.bookStore = bookStore;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para agregar un nuevo libro al ArrayList<Book>
     *
     * @param book
     */
    public void addBook() {
        Scanner keyboardDouble = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        try {
            System.out.print("Ingrese ISBN: ");
            String isbn = keyboardString.nextLine();
            System.out.print("Ingrese Nombre del Autor: ");
            String author = keyboardString.nextLine();
            System.out.print("Ingrese Nombre del Titulo: ");
            String title = keyboardString.nextLine();
            System.out.print("Ingrese el Precio: ");
            double price = keyboardDouble.nextDouble();
            Book newBook = new Book(isbn, author, title, price);
            bookStore.add(newBook);
        } catch (InputMismatchException input) {
            System.out.println("Error: valor no es valido: " + input.getMessage());
        }

    }

    /**
     * Metodo para imprimir en consola o generar un reporte con todos los libros contenidos en el ArrayList<Book>
     * en un archivo txt
     */
    public void lookBookStore() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese la letra. Ver los libros(L) y/o generar un reporte(R)? ");
        String option = keyboard.nextLine();
        if (option.compareToIgnoreCase("L") == 0) {
            printBookStore(this.getBookStore());
        }
        if (option.compareToIgnoreCase("R") == 0) {
            generaitorReportOfBookStore(this.getBookStore());
        }
    }

    /**
     * Funcion para borrar un determinado libro mostrando que libro fue borrado en consola
     *
     * @return
     */
    public void deleteBookInBookStore() {
        boolean foundBook = false;
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.print("Ingrese el ISBN del libro: ");
            String isbn = keyboard.nextLine();

            Iterator<Book> bookStoreDelete = bookStore.iterator();
            while ((bookStoreDelete.hasNext()) && (foundBook == false)) {
                Book book = bookStoreDelete.next();
                if (book.getIsbn().compareToIgnoreCase(isbn) == 0) {
                    bookStoreDelete.remove();
                    foundBook = true;
                    System.out.println("Libro con ISBN borrado...");
                }
            }
            if (foundBook==false) {
                System.out.println("Error: libro no existe ");
            }
        } catch (NoSuchElementException notFound) {
            System.out.println("Error: libro no existe " + notFound.getMessage());
        }

    }

    /**
     * Metodo que permite la busqueda de libros por el nombre del autor mostrando en consola los resultados y dando la opcion de generar un reporte con los resultado en un archivo txt
     */
    public void filterByAuthor() {
        Scanner keyboardNameAuthor = new Scanner(System.in);
        Scanner keyboardReport = new Scanner(System.in);
        ArrayList<Book> reportListBook = new ArrayList<>();

        System.out.print("Ingrese nombre del autor: ");
        String nameAuthor = keyboardNameAuthor.nextLine();

        Iterator<Book> filterByAuthor = bookStore.iterator();
        while (filterByAuthor.hasNext()) {
            Book book = filterByAuthor.next();
            if (book.getAuthor().compareToIgnoreCase(nameAuthor) == 0) {
                reportListBook.add(book);
            }
        }

        System.out.println("Resultados del filtro por Autor");
        if (reportListBook.size() > 0) {
            printBookStore(reportListBook);
            System.out.print("Desea generar un reporte? S/N: ");
            String optionReport = keyboardReport.nextLine();
            if ((optionReport.equalsIgnoreCase("S")) && (optionReport.equalsIgnoreCase("s"))) {
                generaitorReportOfBookStore(reportListBook);
            }
        } else {
            System.out.println("No hay resultados de busqueda...");
        }

    }

    /**
     * Metodo que permite la busqueda de libros por el precio del libro mostrando en consola los resultados y dando la opcion de generar un reporte con los resultado en un archivo txt
     */
    public void filterByPrice() {
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        ArrayList<Book> filterListBookByPrice = new ArrayList<>();
        try {
            System.out.print("Ingrese el precio: ");
            double priceBook = keyboard.nextDouble();

            Iterator<Book> bookStoreIterator = this.bookStore.iterator();
            while (bookStoreIterator.hasNext()) {
                Book book = bookStoreIterator.next();
                if (book.getPrice() <= priceBook) {
                    filterListBookByPrice.add(book);
                }
            }

            System.out.println("Resultados del filtro por Autor");
            printBookStore(filterListBookByPrice);
            System.out.print("Desea generar un reporte? S/N ");
            String optionReport = keyboardString.nextLine();
            if ((optionReport.equalsIgnoreCase("S")) && (optionReport.equalsIgnoreCase("s"))) {
                generaitorReportOfBookStore(filterListBookByPrice);
            } else {
                System.out.println("No hay resultados de busqueda...");
            }
        } catch (InputMismatchException input) {
            System.out.println("Error: valor no es valido: " + input.getMessage());
        }
    }

    /**
     * Metodo de la clase abstracta Utilities que permite recorrer todos los libros del ArrayList<Book>
     *
     * @param listBooks
     */
    @Override
    public void printBookStore(ArrayList<Book> listBooks) {
        Iterator<Book> newListBook = listBooks.iterator();
        while (newListBook.hasNext()) {
            System.out.println(newListBook.next().printBook());
        }
    }

    /**
     * Metodo de la clase abstracta Utilities que permite el poder generar un reporte en un archivo txt dependiendo de donde lo llamen
     *
     * @param listBooks
     */
    @Override
    public void generaitorReportOfBookStore(ArrayList<Book> listBooks) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el nombre del reporte: ");
        String file = keyboard.nextLine();

        FileWriter fileWriter = null;
        PrintWriter printWritter = null;
        try {
            fileWriter = new FileWriter(file);
            printWritter = new PrintWriter(fileWriter);
            Iterator<Book> listBook = listBooks.iterator();
            while (listBook.hasNext()) {
                printWritter.println(listBook.next().printBook());
            }
            printWritter.close();
        } catch (IOException e) {
            System.out.println("Error: escritura en el archivo: " + e.getMessage());
        }
    }

}
