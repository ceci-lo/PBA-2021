package mario;

import java.util.Random;

public class Aldeano extends Personaje { //extend para heredar de la clase Personaje
    
    // Declaración de atributos específicos de la subclase Aldeano
    private String camisa;
    private String pantalon;
    private String gorro;
    private char letra; 
    private String moneda;
    
    // Método constructor   
    public Aldeano(String nombre,int posicionX, int posicionY, String orientacion,String camisa, String pantalon, String gorro, char letra,String moneda) {
        super(nombre,posicionX, posicionY,orientacion); 
        this.camisa = camisa;
        this.pantalon = pantalon;
        this.gorro = gorro;
        this.letra = letra;
        this.moneda = moneda;
    }
    
    // Getters y setter para cada atributo
     public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getPantalon() {
        return pantalon;
    }

    public void setPantalon(String pantalon) {
        this.pantalon = pantalon;
    }

    public String getGorro() {
        return gorro;
    }

    public void setGorro(String gorro) {
        this.gorro = gorro;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public String getMoneda(){
        return moneda;
    }
    
    public void setMoneda(String moneda){
        this.moneda=moneda;
    }
    
    // Métodos específicos de la subclase
     public void Caminar() {
        if(this.orientacion.equals("Derecha"))
            this.posicionX++;
        else 
            this.posicionX--;
    }    
     
     public void lanzarMoneda(){
         String [] opciones = {"Cara", "Cruz"};
         Random random = new Random();
         int select = random.nextInt(opciones.length);
         this.moneda = opciones[select];
     }

    @Override
    public String toString() {
        return "Aldeano" + "camisa=" + camisa + ", pantalon=" + pantalon + ", gorro=" + gorro + ", letra=" + letra + '}';
    }
    
}
