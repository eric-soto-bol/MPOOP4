/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author erics
 */
class Perro {
     String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;
    public Perro(){
        color=null;
        pelaje=null;
        tamaño=0;
        raza=null;
        edad=0;
    }
    public Perro(String color, String pelaje, int tamaño, String raza, int edad){
        this.color=color;
        this.pelaje=pelaje;
        this.tamaño=tamaño;
        this.raza=raza;
        this.edad=edad;
    }
   
    public void jugar(){
        System.out.println("gauf guaf");
}
    public boolean comer(){
        System.out.println("grrrr");
        return true;
    }
    public void correr(){
        System.out.println("me corro");
    }
    public void morder(){
        System.out.println("grrrrr");
    }
    public void saltar(float x,float y,float z){
        System.out.println("me movi a  "+x+","+y+","+z+"." );
    }
     public void imprimirPerro(){
        System.out.println("color "+color+" pelaje "+pelaje+"");
        System.out.println("tamaño "+tamaño+" raza "+raza);       
        System.out.println("edad "+edad+"años");
        
    }

}
