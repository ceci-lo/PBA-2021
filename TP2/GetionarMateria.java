/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

public class GetionarMateria {
    private int nLegajo;
    private String nombre;
    private String apellido;
    private int fechaNacimiento;
    private String email;
    private int fechaDeHoy;

    public GetionarMateria(int nLegajo, String nombre, String apellido, int fechaNacimiento, String email) {
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

    public int getFechaDeHoy() {
        return fechaDeHoy;
    }

    public void setFechaDeHoy(int fechaDeHoy) {
        this.fechaDeHoy = fechaDeHoy;
    }

    @Override
    public String toString() {
        return "GetionarMateria{" + "nLegajo=" + nLegajo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", fechaDeHoy=" + fechaDeHoy + '}';
    }
    
    
}
