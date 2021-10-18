/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrc;

import java.text.DecimalFormat;

/**
 *
 * @author gmicheri
 */
 public class Herencia {

    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat formato1 = new DecimalFormat("0.00");
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        
        System.out.println("Area del circulo " + formato1.format(circulo.CalcularArea()));

        circulo.setRadio(44.55);
        System.out.println("Area del circulo " + formato1.format(circulo.CalcularArea()));
        
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        System.out.println("Area del rectangulo " + formato1.format(rectangulo.CalcularArea()));
        
        triangulo.setBase(50);
        triangulo.setAltura(70);
        System.out.println("Area del Triangulo " + formato1.format(triangulo.CalcularArea()));
    }    
}


