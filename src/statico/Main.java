/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statico;

import java.util.ArrayList;

/**
 *
 * @author walte
 */
public class Main {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Walter", 1566.56);
        Usuario u2 = new Usuario("Francisco", 2656.78);
        Usuario u3 = new Usuario("Pedro", 4578.12);
        Usuario u4 = new Usuario("Vilma", 4892.23);
        Usuario u5 = new Usuario("Liliana", 78568.89);
        u1.donarEfectivoDonacion();
        u2.donarEfectivoDonacion();

        System.out.println("******************FONDOS TOTALES INICIAL******************");
        Plataforma.getFondosTotales();

        ArrayList<Usuario> listado = new ArrayList();
        listado.add(u1);
        listado.add(u2);
        listado.add(u3);
        listado.add(u4);
        listado.add(u5);

        System.out.println("******************USUARIOS******************");
        for (Usuario usuario : listado) {
            System.out.println(usuario.toString());
        }

        System.out.println("******************PLATAFORMAS******************");
        Plataforma peta = new Plataforma("Save The Animals");
        System.out.println("Fundacion: " + peta.getNombre());
        peta.setFondosPropios(500.50);
        System.out.println("Fondos donados: " + peta.getFondosPropios());

        Plataforma children = new Plataforma("Save the Children");
        System.out.println("Fundacion: " + children.getNombre());
        children.setFondosPropios(250.50);
        System.out.println("Fondos donados: " + children.getFondosPropios());

        System.out.println("******************FONDOS TOTALES FIN******************");
        Plataforma.getFondosTotales();
    }
}
