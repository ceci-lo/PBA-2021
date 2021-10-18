/**
 *
 * @author gmicheri
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrc;

/**
 *
 * @author gmicheri
 */
 public class HerenciaPoli {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        
        System.out.println("Area del circulo " + calcularArea(circulo));
        
        circulo.setRadio(44.55);
        System.out.println("Area del circulo " + calcularArea(circulo));

        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        System.out.println("Area del rectangulo " + calcularArea(rectangulo));

        triangulo.setBase(50);
        triangulo.setAltura(60);
        System.out.println("Area del Triangulo " + calcularArea(triangulo));
    }
    
    public static double calcularArea(Figura f){ // polimorfismo
        return f.CalcularArea();
    }
    
}
