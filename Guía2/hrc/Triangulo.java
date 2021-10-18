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
 public class Triangulo extends Figura {
    
    private double base;
    private double altura;
    
    public Triangulo() {
        this.base=0;
        this.altura=0;
    }
    
    public Triangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }
    
    @Override
    public double CalcularArea() {
        
        return this.area=(base*altura)/2;
     }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
}