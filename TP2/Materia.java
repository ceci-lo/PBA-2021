/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Materia {

    private String Id;
    private String NombreMateria;

    List<Alumno> Matriculas = new ArrayList();
    List<Asistencia> Asistencias = new ArrayList();
    List<Alumno> asistencia = new ArrayList();
    List<Materia> nuevaMateria = new ArrayList();

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public Materia() {

    }

    public Materia(String Id, String NombreMateria) {
        this.Id = Id;
        this.NombreMateria = NombreMateria;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombreMateria() {
        return NombreMateria;
    }

    public void setNombreMateria(String NombreMateria) {
        this.NombreMateria = NombreMateria;
    }

    @Override
    public String toString() {
        return Id + " -- " + NombreMateria;
    }

    public void RegistrarMateria() {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el identificador de la materia ");
        String id = in.nextLine();

        System.out.println("Ingrese el nombre completo de la materia ");
        String nombreMateria = in.nextLine();

        Materia materia = new Materia(id, nombreMateria);
        nuevaMateria.add(materia);
        System.out.println(materia);
    }

    public void MatricularAlumno() {
        Scanner in = new Scanner(System.in);

        int nLegajo = 0;
        String nombre = "", apellido = "", fecha = "", email = "";

        System.out.println("Ingrese al nuevo alumno");

        //me pide los datos del alumno por consola
        System.out.println("Ingresa el Número de legajo : ");
        nLegajo = in.nextInt();
        in.nextLine();

        System.out.println("Ingresa el Nombre : ");
        nombre = in.nextLine();

        System.out.println("Ingresa el Apellido : ");
        apellido = in.nextLine();

        System.out.println("Ingresa la fecha de nacimiento : ");
        fecha = in.nextLine();
        in.nextLine();

        System.out.println("Ingresa el Email : ");
        email = in.nextLine();
        Alumno a = new Alumno(nLegajo, nombre, apellido, fecha, email);
        this.Matriculas.add(a);

    }

    public List<Alumno> Alumnos() {

        return this.Matriculas;
    }

    public List<Materia> Materia() {
        return this.nuevaMateria;
    }

    public Alumno BuscarAlumno(int nLegajo) {

        Alumno encontrado = null;

        for (Alumno alumno : this.Matriculas) {

            if (alumno.getnLegajo() == nLegajo) {

                encontrado = alumno;
                System.out.println("El alumno es : " + alumno);

            }
        }

        return encontrado;
    }

    public void DesmatricularAlumno(int nLegajo) {

        BuscarAlumno(nLegajo);

        this.Matriculas.remove(BuscarAlumno(nLegajo));

        System.out.println("El alumno ha sido desmatriculado exitosamente");

    }

    public void registrarAsistencia() {

        Scanner in = new Scanner(System.in);

        // ver 
        String fecha;

        System.out.println("Ingese la fecha Actual ");
        fecha = in.nextLine();

        int presente = 0;

        for (int i = 0; i < Matriculas.size(); i++) {

            System.out.println("Si el alumno "
                    + Matriculas.get(i).getNombre()
                    + " " + Matriculas.get(i).getApellido()
                    + " se encuentra presente ingrese 1 ");

            presente = in.nextInt();

            if (presente == 1) {

                asistencia.add(Matriculas.get(i));

            }
            //asistencia.add(Matriculas.get(i));
        }

        this.Asistencias.add(new Asistencia(fecha, asistencia));

        System.out.println(asistencia);
    }

    public void imprimirInscriptos() {

        int cantidadAlumnos = Matriculas.size();

        Collections.sort(Matriculas);

        Iterator<Alumno> a = Matriculas.iterator();
        System.out.println("==============================================");
        String alineacion = "| %-12s | %-12s | %-12s |%n";
        System.out.format("+--------------+--------------+--------------+%n");
        System.out.println(ANSI_BLUE + "|   N° legajo  " + ANSI_RESET + ANSI_BLUE + "|   Apellido   " + ANSI_RESET + ANSI_BLUE + "|     Nombre   |" + ANSI_RESET);
        //System.out.format("+  N° legajo |  Nombre    |  Apellido  +%n");
        System.out.format("+--------------+--------------+--------------+%n");
        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno l = a.next();
            System.out.format(alineacion, l.getnLegajo(), l.getApellido(), l.getNombre());
            System.out.format("+--------------+--------------+--------------+%n");
        }

        System.out.format("                       Total Inscriptos : " + cantidadAlumnos);
        System.out.println(" ");
    }

    public void imprimirAsistencia() {
        String fecha = "";

        int cantidadAsistencia = asistencia.size();
        Collections.sort(asistencia);

        Iterator<Alumno> a = asistencia.iterator();

        for (int i = 0; i < Asistencias.size(); i++) {
            fecha = Asistencias.get(i).fecha;
        }

        System.out.println(this.getNombreMateria() + this.getId() + Id + NombreMateria + " Asistencia del dia : " + fecha);

        System.out.println("==============================================");
        String alineacion = "| %-12s | %-12s | %-12s |%n";
        System.out.format("+--------------+--------------+--------------+%n");
        System.out.println(ANSI_BLUE + "|   N° legajo  " + ANSI_RESET + ANSI_BLUE + "|   Apellido   " + ANSI_RESET + ANSI_BLUE + "|     Nombre   |" + ANSI_RESET);
        //System.out.format("+  N° legajo |  Nombre    |  Apellido  +%n");
        System.out.format("+--------------+--------------+--------------+%n");
        for (int i = 0; i < cantidadAsistencia; i++) {
            Alumno l = a.next();
            System.out.format(alineacion, l.getnLegajo(), l.getApellido(), l.getNombre());
            System.out.format("+--------------+--------------+--------------+%n");
        }

        System.out.format("                       Total de Asistencia : " + cantidadAsistencia);
        System.out.println(" ");

    }
}
