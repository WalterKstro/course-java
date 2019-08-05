/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoLibreria;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author walte
 */
public class GeneraitorBooks {
    public static ArrayList<Book> generaitorBooks(int numberBooks){
        ArrayList<Book> listBooks = new ArrayList<>();
        Random random = new Random();
        DecimalFormat formatoDecimal = new DecimalFormat("#.00");
        Book book = null;
        String[] isbns = {
                           "1081772385847","2781772885847","3781772585847","4781772485847","5581772385847",
                           "10081772385847","9781772885847","8781772585847","7781772485847","6581772385847",
                           "11081772385847","12781772885847","13781772585847","14781772485847","15581772385847",
                           "20081772385847","19781772885847","18781772585847","17781772485847","16581772385847"
                        };
        
        String[] authors = {
                              "Homero","Franz","Kafka","Danilo","Melani",
                              "Leon","German","Julio","Perez","Rodrigo",
                              "Walter","Francisco","German","Victor","Vilma",
                              "James","Paco","Alexander","Liliana","Heidy",
                              "Yulisa","Daniel","Oscar","Luis","Marta",
                            };
        
        String[] titles = {
                            "Odisea","El proceso","La mefamorfosis","Moby Dick","Guerra y Paz",
                            "Ficciones","Crimen y Castigo","La Biblia","La montaña magica","Ulises",
                            "Bajo el volcan","Pinocho","El principito","Java desde cero","Vue esential",
                            "Angular esential","React esential","Rimas y leyendas","Lolita","El banquete",
                            "Algebra de Baldor","Calculo I","Calculo II","Electronica analoga","Electronica digital",
                           };
        
        for (int i = 0; i < numberBooks; i++) {
            String isbn = isbns[random.nextInt(isbns.length - 1)];
            String author = authors[random.nextInt(authors.length - 1)];
            String title = titles[random.nextInt(titles.length - 1)];
            double price = Double.parseDouble(formatoDecimal.format(random.nextDouble() * 1000));
            book = new Book(isbn, author, title, price);
            listBooks.add(book);
            
        }
        return listBooks;
    }
}
