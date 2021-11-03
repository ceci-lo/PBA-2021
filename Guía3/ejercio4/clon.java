/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercio4;

public class clon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clonar p = new Clonar("000000000000",
                "000000000000", "000000000000", "000000000000");
        Clonar p2 = p.clonar();
        p2.setA("111111111111");
        Clonar p3 = p.clonar();
        p3.setB("111111111111");
        Clonar p4 = p.clonar(); 
        p4.setC("111111111111");
        Clonar p5 = p.clonar();
        p5.setD("111111111111");

        p.toString();
        p2.toString();
        p3.toString();
        p4.toString();
        p5.toString();

    }

   
    
}
