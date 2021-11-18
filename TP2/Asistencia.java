/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;
import java.util.*;



public class Asistencia {

    public String fecha;
    
    List<Alumno> alumnosPresentes = new ArrayList();

    public Asistencia(String fecha, List<Alumno> AlumnosP) {
        this.fecha = fecha;
        this.alumnosPresentes = AlumnosP;
    }

   
    @Override
    public String toString() {
        return "Asistencia del dia " + fecha;
    }

    public String getFecha() {
        return fecha;
    }

  
    

}
