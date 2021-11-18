package TP2;

import java.util.*;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu();

    }

    public static void Menu() {
        Scanner in = new Scanner(System.in);   

        Materia S = new Materia();

        

        System.out.println("    MENÚ INICIO ");
        System.out.println(" ==================== ");
        System.out.println("1. -- Registrar Materia");
        System.out.println("9.- Salir. ");
        System.out.println("Ingrese una opción");

        int opcion = in.nextInt();

        switch (opcion) {

            case 1:
                S.RegistrarMateria();
              
                // Menu gestionar materia
                MenuGestionMateria();
                break;

            case 9:
                System.out.println("Gracias. Uested ha salido del sistema");
                break;
        }

    }

    public static void MenuGestionMateria() {

        Scanner in = new Scanner(System.in);

        Materia materia = new Materia();
         

        //me  guarda los datos en el array
       
        int opcion ;
        opcion = mostrarMenu();
        do {
         
            if (opcion == 1) {

                System.out.println("MATRICULAR ALUMNO");

                materia.MatricularAlumno();

                System.out.println("El alumno ha sido añadido con éxito");

                System.out.println(materia.Alumnos());

                System.out.println("1. cargar otro alumno");
                System.out.println("9. Atras");
            } else if (opcion == 2) {

                System.out.println("DESMATRICULAR ALUMNO");

                System.out.println("Ingrese el numero de legajo del alumno que desee desmatricular");
                int nLegajo = in.nextInt();

                materia.DesmatricularAlumno(nLegajo);

                System.out.println("1. Desmatricular otro alumno");
                System.out.println("9. Atras");
            } else if(opcion == 3){
                
                materia.registrarAsistencia();
                System.out.println("9. Atras.");
                
            } else if (opcion == 4) {
                
                System.out.println(" LISTADO INSCRIPTOS  ");
                materia.imprimirInscriptos();
                System.out.println("9. Atras.");
                
            } else if (opcion == 5){
                materia.imprimirAsistencia();
                System.out.println("9. Atras");
            }
            opcion = in.nextInt();
            in.nextLine();

            if (opcion != 1) {
                opcion = mostrarMenu();

            }
        } while (opcion != 9);

        System.out.println(materia.Alumnos());

    }

    public static int mostrarMenu() {

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
        return opcion;
    }

}
