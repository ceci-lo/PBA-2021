
package TP2;
import java.util.*;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RegistrarMateria M1 = new RegistrarMateria("PBA", "Progamacion Basica.");
        MatricularAlumno A1 = new MatricularAlumno(in.nextInt(), in.nextLine(),in.nextLine(),in.nextInt(),in.nextLine());
      
        M1.toString();
        System.out.println(A1.InscribirAlumno(A1)); 
    }
    
}
