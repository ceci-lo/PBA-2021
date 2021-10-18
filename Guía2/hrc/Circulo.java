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
 public class Circulo extends Figura {
    
    final double pi=3.1416;
    private double radio;

    public Circulo() {
        this.radio=0;
    }
    
    public Circulo(double radio) {
        this.radio=radio;
    }
    
    @Override
    public double CalcularArea() {
        return this.area=pi*radio*radio;
     }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}