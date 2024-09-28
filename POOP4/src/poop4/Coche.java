/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author erics
 */
class Coche {
    String color;
    int modelo;
    float motor;
    int puertas;
    
    public Coche(){
        color=null;
        modelo=0;
        motor=0; 
        puertas=0;
    }
    public Coche(String color,int modelo,float motor,int puertas){
        this.color=color;
        this.modelo=modelo;
        this.motor=motor;
        this.puertas=puertas;
    }
    public void capacidad(){
        System.out.println("EL inge y 4 lobas");
    }
    public boolean frena(){
        System.out.println("Disco");
        return true;
    }
    public boolean acelera(){
        System.out.println("0-100km/h en 8s");
        return true;
    }
    public void imprimirCoche(){
        System.out.println("Color "+color+" modelo "+modelo);
        System.out.println("Motor "+motor+"L, Puertas "+puertas);
    }
}
