/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author erics
 */
class Alumno {
    int edad;
    String nombre;
    int ciclo;
    
    public Alumno(){
        edad=0;
        ciclo=0;
        nombre=null;
    }
    public Alumno(int edad, int ciclo, String nombre){
        this.ciclo=ciclo;
        this.edad=edad;
        this.nombre=nombre;
        
    }
    public boolean tarea(){
        System.out.println("si");
        return true;
    }
    public boolean asistencia(){
        System.out.println("si");
        return true;
    }
    public boolean exponer(){
        System.out.println("no");
        return true;
    }
    public void imprimirAlumno(){
        System.out.println("Nombre "+nombre+" edad "+edad+" ciclo "+ciclo);          
    }
}
