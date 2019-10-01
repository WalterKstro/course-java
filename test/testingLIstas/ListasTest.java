/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingLIstas;

import estructuraListas.Listas;
import estructuraListas.Nodo;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author walte
 */
public class ListasTest {
    private Listas<String> listado;
    public ListasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        listado = new Listas<>();
        listado.addLast("A");
        listado.addLast("B");
        listado.addLast("C");
        listado.addLast("D");
    }
    
    @After
    public void tearDown() {
        listado = new Listas<>();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void sizeListado() {
        listado = new Listas<>();
         assertEquals(listado.size(), 0);
     }
     @Test
     public void testLisadoAgregado(){
         setUp();
         assertEquals(listado.getSize(), 4);
         tearDown();
     }
     @Test
     public void addFisrt(){
         setUp();
         listado.addFirst("Primero");
         assertEquals(listado.getFirst(), "Primero");
     }
     @Test
     public void removeAlways(){
         addFisrt();
         listado.removeFirst();
         assertEquals(listado.getFirst(), "A");
     }
     @Test
     public void testResultados(){
      tearDown();
      setUp();
        String salida = "";
         Iterable<Nodo<String>> listadoIterable = listado.iterator();
         Iterator<Nodo<String>> iterator = listadoIterable.iterator();
         while (iterator.hasNext()) {             
             Nodo<String> nodo = iterator.next();
             salida+=nodo.getElemento();
         }
         
         assertEquals(salida, "ABCD");
     }
}
