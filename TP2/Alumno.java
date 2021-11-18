/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SECRETARIA
 */
public class Alumno  implements  Comparable<Alumno>{
    
    private int nLegajo;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String email;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    public Alumno(int nLegajo, String nombre, String apellido, String fechaNacimiento, String email) {
        this.nLegajo = nLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    public int getnLegajo() {
        return nLegajo;
    }

    public void setnLegajo(int nLegajo) {
        this.nLegajo = nLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ANSI_GREEN +"id "+ANSI_RESET+ nLegajo +ANSI_GREEN+ " nombre : "+ ANSI_RESET + nombre + ANSI_GREEN+ ", apellido= " +ANSI_RESET+ apellido +ANSI_GREEN + " fechaNacimiento: "+ANSI_RESET +  fechaNacimiento + ANSI_GREEN+ ", email : "+ ANSI_RESET + email ;
    }
    public int compareTo(Alumno a){
          int sortApellido = apellido.compareTo(a.getApellido());
          
          if(sortApellido != 0){
              return sortApellido;
          }
         
          return nombre.compareTo(a.getNombre());
      
      }
   
    
}
