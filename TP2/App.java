
package TP2;
import java.util.*;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RegistrarMateria M1 = new RegistrarMateria("PBA", "Progamacion Basica.");
        
        List <Alumno> MatricularAlumno = new ArrayList();
        
        M1.toString();
        MatricularAlumno.add( new Alumno(in.nextInt(), in.nextLine(),in.nextLine(),in.nextInt(),in.nextLine()));
        int nLegajoE = 0;
        for (int i = 0; i < MatricularAlumno.size(); i++) {
            if(MatricularAlumno.getnLegajo(i) == nLegajoE ){
                MatricularAlumno.remove(MatricularAlumno.get(i));
                System.out.println("El Alumno ha sido borrado exitosamente");
            } else {
                System.out.println("El Alumno no se encuentra en el sistema");
            }
        }
    }
    
}
