/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

import static java.lang.Math.sqrt;

/**
 *
 * @author erics
 */
class Tri {
    float area;
    float base;
    float altura;
    float hipotenusa;
    
    public Tri(){
        area=0;
        base=0;
        altura=0; 
        hipotenusa=0;
    }
    public Tri(float base, float altura,float area, float hipotenusa){
        this.altura=altura;
        this.base=base;
        hipotenusa = (float) sqrt(base*base+altura*altura);
        this.hipotenusa=hipotenusa;
        area = base*altura/2;
        this.area=area;
    }
    public void funciones(){
        System.out.println("Sen, cos, tan");
    }
    public void imprimirTri(){
        System.out.println("Base "+base+" Altura "+altura+" Area "+area+" hipotenusa "+hipotenusa);
    }
}
