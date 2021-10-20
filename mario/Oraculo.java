package mario;

public class Oraculo extends Personaje {
        
    public Oraculo(String nombre,int posicionX, int posicionY, String orientacion){
        super(nombre,posicionX, posicionY,orientacion);
    }
    
    public boolean Opcion1 (int pregunta, int posicion){
        boolean esMayor = false;
        if(pregunta < posicion){
            esMayor = true;
        }
        return esMayor; 
     }
    
    public boolean Opcion2 (int pregunta, int posicion){
        boolean esMenor = false;
        if(pregunta > posicion){
            esMenor = true;
        }
        return esMenor; 
    }
    
    public boolean Opcion3 (int pregunta, int posicion){
        boolean respuestafinal;
        if(pregunta == posicion){
            respuestafinal = true;
            System.out.println("¡Felicidades, encontraste la posición de la princesa!");
            System.out.println("La princesa está en: "+posicion);
        }else {
            System.out.println("GAME OVER");
            respuestafinal = false;
        }
    return respuestafinal;
    }
    

}
