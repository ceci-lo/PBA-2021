/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author SECRETARIA
 */
public class RegistrarMateria {
    private String Id; 
    private String NombreMateria;

    public RegistrarMateria(String Id, String NombreMateria) {
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
        return  Id + " -- " + NombreMateria;
    }
   
    
}
