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
public class Main {

    public static void main(String[] args) {

        Alumno walter = new Alumno("Base de datos I", 78, "Walter Francisco", "Cherec Castro", 20723056);
        Alumno francisco = new Alumno("Desarrollo Web", 89, "Francisco Daniel", "Hernandez Giron", 20725698);
        Coordinador coordinador = new Coordinador(5, "Compiladores", 68, "Kevin Alexander", "Sucuc Otzoy", 27058923);

        Alumno daniel = new Alumno("Base de datos I", 88, "Daniel Francisco", "Cherec Castro", 20723056);
        Alumno luis = new Alumno("Desarrollo Web", 77, "Luis Daniel", "Hernandez Giron", 20725698);
        Coordinador milton = new Coordinador(5, "Compiladores", 95, "Milton Alexander", "Sucuc Otzoy", 27058923);

        Alumno jose = new Alumno("Base de datos I", 28, "Jose Francisco", "Cherec Castro", 20723056);
        Alumno juan = new Alumno("Desarrollo Web", 69, "Juan Daniel", "Hernandez Giron", 20725698);
        Coordinador carlos = new Coordinador(5, "Compiladores", 72, "Carlos Alexander", "Sucuc Otzoy", 27058923);

        System.out.println("*********************PROFESORES*********************");
        Profesor profesor = new Profesor("DBA,Oracle", 7800.50, "Melvin Armando", "Muñoz Sulecio", 20720401);
        System.out.println("PROFESOR = " + profesor.imprimirInformacionProfesor().toUpperCase());

        System.out.println("*********************DIRECTOR*********************");
        Director director = new Director(12500.50, "agente@director.com.gt", 8, "Diego Alberto", "Quiñones Hernandez", 20725689);
        System.out.println("DIRECTOR = " + director.imprimirInformacionDirector().toUpperCase());

        System.out.println("*********************AULA*********************");
        Alumno[] alumnosA = new Alumno[3];
        alumnosA[0] = walter;
        alumnosA[1] = coordinador;
        alumnosA[2] = francisco;

        Alumno[] alumnosB = new Alumno[3];
        alumnosB[0] = daniel;
        alumnosB[1] = luis;
        alumnosB[2] = milton;

        Alumno[] alumnosC = new Alumno[3];
        alumnosC[0] = jose;
        alumnosC[1] = juan;
        alumnosC[2] = carlos;

        Aula seccionA = new Aula(alumnosA, profesor, "A", "Primero Primaria");
        Aula seccionB = new Aula(alumnosB, profesor, "B", "Primero Primaria");
        Aula seccionC = new Aula(alumnosC, profesor, "C", "Primero Primaria");

        System.out.println("Promedio del aula seccion A: " + seccionA.calcularPromedioSeccion());
        System.out.println("Promedio del aula seccion B: " + seccionB.calcularPromedioSeccion());
        System.out.println("Promedio del aula seccion C: " + seccionC.calcularPromedioSeccion());

        System.out.println("*********************COLEGIO*********************");
        Aula[] aulas = new Aula[3];
        aulas[0] = seccionA;
        aulas[1] = seccionB;
        aulas[2] = seccionC;

        Colegio cetach = new Colegio(aulas, "CETACH", director);
        System.out.println("Promedio colegio: " + cetach.calcularPromedioColegio());
        System.out.println("Mejor alumno del colegio: " + cetach.mejorAlumnoColegio().imprimirInformacionAlumno());

    }
}
