/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercio4;

public class Clonar implements Cloneable {
    
    private String a;
    private String b;
    private String c;
    private String d;

    public Clonar(String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    
    public Clonar clonar(){
        Clonar s = new Clonar(this.a, this.b, this.c, this.d);
        return s;
}

    @Override
    public String toString() {
        return  a +  b +  c  + d ;
    }
    
}
