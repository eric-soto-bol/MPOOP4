/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author erics
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio en clase");
        Punto punto = new Punto();
        punto.imprimePunto();
        Punto punto2 = new Punto(1,2,"punto 2");
        punto2.imprimePunto();
        punto.x=20;
        punto.y=100;
        punto.nombre="punto 1";
        punto.imprimePunto();
        System.out.println(punto);
        System.out.println("*******");
       ////////////////////////////
        System.out.println("Clase perro");
        Perro perro = new Perro();
        perro.imprimirPerro();
        Perro perro2 = new Perro("negro","mugroso",1,"boxer",7);
        perro2.imprimirPerro();
        perro2.jugar();
        perro2.saltar(3.34f, 7, 9);
        System.out.println("*******");
        //////////////////////////////
        System.out.println("Clase alumno");
        Alumno alumno = new Alumno();
        alumno.imprimirAlumno();
        Alumno alumno2 =new Alumno(2025,18,"Eric Soto");
        alumno2.imprimirAlumno();
        System.out.println("El alumno asistio?");
        alumno2.asistencia();
        System.out.println("El alumno entrego tarea?");
        alumno2.tarea();
         System.out.println("El alumno expuso?");
        alumno2.exponer();
        System.out.println("*******");
        ////////////////////////////////////////
        System.out.println("Clase coche");
        Coche coche = new Coche();
        coche.imprimirCoche();
        Coche coche2 = new Coche("rojo",2004, 2.5f,2);
        coche2.imprimirCoche();
        System.out.println("Capacidad:");
        coche2.capacidad();
        System.out.println("Velocidad:");
        coche2.acelera();
        System.out.println("Frenos:");
        coche2.frena();
        System.out.println("*******");
        /////////////////////////////////////////
        System.out.println("Clase Profesor");
        Profesor profesor = new Profesor();
        profesor.imprimirProfesor();
        Profesor profesor2 = new Profesor(34,5,"Soto","POO");
        profesor2.imprimirProfesor();
        System.out.println("Su clase es buena?");
        profesor2.enseñar();
        System.out.println("Asistio?");
        profesor2.asistencia();
        System.out.println("Forma de evaluar?");
        profesor2.evaluar();
        System.out.println("*******");
        /////////////////////////////////////
        System.out.println("Clase Triangulo Rectangulo");
        Tri tri =new Tri();
        tri.imprimirTri();
        Tri tri2 =new Tri(4.5f,3.4f,0.0f,0.0f);
        tri2.imprimirTri();
        System.out.println("Funciones trigonometricas");
        tri2.funciones();
    }
        
       
    }
    

