package mario;

public abstract class Personaje {
    
    // Declaración de las variables características de la clase
    protected String nombre;  
    protected int posicionX;
    protected int posicionY;
    protected String orientacion; 

    // Método constructor A
    /*public Personaje(String nombre) {
        this.nombre = nombre;       
        this.posicionX = 0;
        this.posicionY = 0;
        this.orientacion = "Derecha";
    }*/

    // Método constructor B
    public Personaje(String nombre,int posicionX, int posicionY, String orientacion) {
        this.nombre = nombre;   
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.orientacion = orientacion;
    }

    // Método getter
    public String getNombre() {
        return nombre;
    }

    // Método setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    // Métodos característicos de la clase:
    
    public void Saludar() {
        System.out.println("Hola, soy " + this.getNombre() + "!");
    }
    
    public void MostrarUbicacion() {
        System.out.println(this.getNombre() + 
                " está orientado hacia la " + this.getOrientacion() + 
                " y se encuentra en la posición (" + this.getPosicionX() + "," + this.getPosicionY() + ").");
    }
    
    public void Girar() {
        if(this.orientacion.equals("Derecha"))
            this.orientacion="Izquierda";
        else 
            this.orientacion="Derecha";
    }
    
   
}