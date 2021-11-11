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
public class Alumno  {
    private int nLegajo;
    private String nombre;
    private String apellido;
    private int fechaNacimiento;
    private String email;
    
    public Alumno (){
    
    }
     public Alumno(int nLegajo, String nombre, String apellido, int fechaNacimiento, String email) {
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

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
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
        return   nLegajo + " nombre= " + nombre + ", apellido= " + apellido + " fechaNacimiento: " + fechaNacimiento + ", email = " + email;
    }
    
     
}
