/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author erics
 */
class Profesor {
    int edad;
    String nombre;
    String materia;
    int grupos;
    
    public Profesor(){
        edad=0;
        grupos=0;
        materia=null;
        nombre=null;
    }
    public Profesor(int edad, int grupos, String nombre,String materia){
        this.grupos=grupos;
        this.materia=materia;
        this.edad=edad;
        this.nombre=nombre;
        
    }
    public void enseñar(){
        System.out.println("si");
        
    }
    public boolean asistencia(){
        System.out.println("si");
        return true;
    }
    public boolean evaluar(){
        System.out.println("Por Examenes");
        return true;
    }
    public void imprimirProfesor(){
        System.out.println("Nombre "+nombre+" edad "+edad+" grupos "+grupos+" materia "+materia);          
    }
}
