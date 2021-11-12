
package TP2;
import java.util.*;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Menu();
        
       
        
       
       // MatricularAlumno.add( new Alumno(in.nextInt(), in.nextLine(),in.nextLine(),in.nextInt(),in.nextLine()));

        
    }
    public static void Menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("    MENÚ INICIO ");
        System.out.println(" ==================== ");
        System.out.println("1. -- Registrar Materia");
        System.out.println("9.- Salir. ");
        System.out.println("Ingrese una opción");
        
        int opcion = in.nextInt();
        switch (opcion) {
            case 1:
                RegistrarMateria M1 = new RegistrarMateria(in.nextLine(), in.nextLine());
                System.out.println(M1);
                // Menu gestionar materia
                MenuGestionaMateria();
                break;
            case 9:
                System.out.println("Gracias. Uested ha salido del sistema");
                break;
        }

    }
    public static void MenuGestionaMateria(){
        Scanner in = new Scanner(System.in);
        System.out.println("    GESTIONAR MATERIA   ");
        System.out.println(" =========================== ");
        System.out.println("1.- Matricular Alumno");
        System.out.println("2.- Desmatricular Alumno");
        System.out.println("3.- Gestionar Asistencia ");
        System.out.println("-- Consultas. ");
        System.out.println("        4.-  Listado de inscriptos ");
        System.out.println("        5.-  Visualizar Asistencia ");
        System.out.println("9.- Salir");
        System.out.println("Ingrese una opcion ");
        int opcion = in.nextInt();
        switch(opcion){
            case 1: System.out.println("MATRICULAR ALUMNO");
                    MatricularAlumno();
            break;
            case 2: System.out.println("DESMATRICULAR ALUMNO");
            break;
            case 3: System.out.println("GESTIONAR ASISTENCIA");
            break;
            case 4: System.out.println("LISTADO DE INSCRIPTOS");
            break;
            case 5: System.out.println("VISULIZAR ASISTENCIA");
        
        }
        
    }
    public static void MatricularAlumno(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese al nuevo alumno");
         List <Alumno> MatricularAlumno = new ArrayList();
         //me pide los datos del alumno por consola
         System.out.println("Ingresa el Número de legajo : ");
         int nLegajo = in.nextInt();
          System.out.println("Ingresa el Nombre : ");
         String nombre = in.nextLine(); 
         System.out.println("Ingresa el Apellido : ");
         String apellido = in.nextLine();
         System.out.println("Ingresa la fecha de nacimiento : ");
         int fecha = in.nextInt();
         System.out.println("Ingresa el Email : ");
         String email = in.nextLine();
         //me  guarda los datos en el array
         MatricularAlumno.add(new Alumno(nLegajo,nombre,apellido, fecha,email));
         System.out.println(MatricularAlumno);
    }
    
}
