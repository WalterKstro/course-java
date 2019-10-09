/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingArbolGenerico;

import estructuraArbolGenericoNodo.ArbolGenerico;
import estructuraTemplateArbolGenerico.Position;
import java.util.ArrayList;
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
public class ArbolTest {

    private ArbolGenerico<String> arbol;
    private ArrayList listado;

    public ArbolTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        arbol = new ArbolGenerico<>();
    }

    @After
    public void tearDown() {
    }

    /**
     * Preba unitaria para determinar el tamaño del arbol
     */
    @Test
    public void testSize() {
        setUp();
        Position<String> root = arbol.addNodoRoot("Root");
        Position<String> hijo1 = arbol.addNodoHijo(root, "A");
        Position<String> hijo2 = arbol.addNodoHijo(root, "B");

        arbol.addNodoHijo(hijo1, "C");
        arbol.addNodoHijo(hijo1, "D");
        
        arbol.addNodoHijo(hijo2, "E");
        arbol.addNodoHijo(hijo2, "G");
        
        assertEquals(arbol.size(), 7);
    }

    /**
     * Preuba Unitaria que determina la eliminacion de un
     * nodo en el arbol
     */
    @Test
    public void testRemove() {
        setUp();
        Position<String> root = arbol.addNodoRoot("Root");
        Position<String> hijo1 = arbol.addNodoHijo(root, "A");
        Position<String> hijo2 = arbol.addNodoHijo(root, "B");

        arbol.addNodoHijo(hijo1, "C");
        arbol.addNodoHijo(hijo1, "D");
        
        arbol.addNodoHijo(hijo2, "E");
        arbol.addNodoHijo(hijo2, "G");
        
        arbol.removeNodo(hijo2);
        
        assertEquals(arbol.size(), 4);
    }
    
    @Test
    public void testRecorrido(){
        setUp();
        Position<String> root = arbol.addNodoRoot("Root");
        Position<String> hijo1 = arbol.addNodoHijo(root, "A");
        Position<String> hijo2 = arbol.addNodoHijo(root, "B");

        arbol.addNodoHijo(hijo1, "C");
        arbol.addNodoHijo(hijo1, "D");
        
        arbol.addNodoHijo(hijo2, "E");
        arbol.addNodoHijo(hijo2, "G");
        String recorrido = "";
        for (Position<String> listado : arbol.iterable()) {
            recorrido+=listado.getElement();
        }
        assertEquals(recorrido, "RootACDBEG");
    }
}
