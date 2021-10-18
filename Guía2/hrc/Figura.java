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
 public abstract class Figura {
    private int grosorLinea;
    private String color;
    double area;
    
    public void figura (){
        grosorLinea = 0;
        color =  "";
    }
    public void figura(int grosorLinea, String color){
        this.grosorLinea = grosorLinea;
        this.color = color;
    }

    public int getGrosorLinea() {
        return grosorLinea;
    }

    public void setGrosorLinea(int grosorLinea) {
        this.grosorLinea = grosorLinea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    abstract public double CalcularArea();
    
    
}
