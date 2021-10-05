package Guía1;

//GUÍA DE EJERCICIOS 1 
//https://campusvirtual.frsf.utn.edu.ar/pluginfile.php/545814/mod_resource/content/4/PBA_U1_Gu%C3%ADa%20de%20ejercicios.pdf

/* 1. Se tiene el siguiente código incompleto para la definición de una patente de un
automotor. Complete las líneas incompletas para lograr una definición correcta (suponga
que los argumentos son válidos)*/
public class Patente {
    String letrasInicioPatente;
    String letrasFinPatente;
    int numeroPatente;
    
    public Patente(){
    letrasInicioPatente = "";
    letrasFinPatente = "";
    numeroPatente = 0;
}
    public Patente(String letrasInicioPatente, String letrasFinPatente, int numeroPatente ){
        this.letrasInicioPatente = letrasInicioPatente;
        this.letrasFinPatente = letrasFinPatente;
        this.numeroPatente = numeroPatente;
    }
    
    public int getNumeroPatente () {
        return numeroPatente;
    }
    /* 2. Al código del ejercicio anterior se le realizaron modificaciones para validar los argumentos
de los métodos setxxx. Ahora se deberá controlar que el atributo numeroPatente asuma
valores entre cero y mil y que el atributo letrasInicioPatente y letrasFinPatente
tenga una longitud de 2. Complete el siguiente código para lograr lo esperado.*/
    
    public void setNumeroPatente (int numeroPatente){
        if((numeroPatente > 0) && (numeroPatente < 1000)){
             this.numeroPatente = numeroPatente;
        } else {
            System.out.println("Número de Patente Inválido");
        }
       
    }
    
    public String getLetrasInicioPatente () {
        return letrasInicioPatente; 
    }
    
    public void setLetrasInicioPatente (String letrasInicioPatente){
        if(validarLongitudPatente(letrasInicioPatente)){
            this.letrasInicioPatente = letrasInicioPatente;
        }else {
            System.out.println("Letras de Patente Inválida");
        }
        
    }
    
    public String getLetrasFinPatente (){
        return letrasFinPatente;
    }
    
    public void setLetrasFinPatente (String letrasFinPatente){
        if(validarLongitudPatente(letrasFinPatente)){
             this.letrasFinPatente = letrasFinPatente;
        } else {
            System.out.println("Letras de Patente Inválida");
        }
       
    }
    public boolean validarLongitudPatente(String unasletrasPatente) {
     return unasletrasPatente.length() == 2;
}
    
    
}

