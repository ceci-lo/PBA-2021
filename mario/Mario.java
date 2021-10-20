package mario;
import java.util.Scanner;
import java.util.Random;

public class Mario {

    public static void main(String[] args) {
        Random gen = new Random();      
        
        Aldeano M = new Aldeano("Mario", 0,0,"Derecha","Roja", "Azul claro", "Rojo", 'M',"Cara");
        Aldeano L= new Aldeano("Luigi",gen.nextInt()%51,0,"Derecha","Verde", "Azul oscuro", "Verde", 'L',"Cara");
        Aldeano P = new Aldeano("Peach", gen.nextInt()%45,0,"Derecha","Violeta", "Amarillo", "Violeta", 'P',"Cara");
        Oraculo W = new Oraculo("Whallum", 0,0,"Derecha");
        
        int posicionMarioYLuigi = Nivel1(M, L);
        
        M.setPosicionX(posicionMarioYLuigi);
        L.setPosicionX(posicionMarioYLuigi);
        
        int posicionPrincesa = Nivel2_etapa1(M,L,P,W);
        
        if(posicionPrincesa == 100){
            System.out.println("Fin del juego");        
        } else{
            P.setPosicionX(posicionPrincesa);
            Nivel2_etapa2(M,L,P);
        
        }
       
    }
    
    public static int Nivel1( Aldeano M,  Aldeano L) {
        M.MostrarUbicacion();
        L.MostrarUbicacion();
        
        if(M.getPosicionX()>L.getPosicionX()) {
            M.Girar();
            M.MostrarUbicacion();
        }
        else if(L.getPosicionX()>M.getPosicionX()) {
            L.Girar();
            L.MostrarUbicacion();
        }
        
        while(M.getPosicionX() != L.getPosicionX()) {
            M.Caminar();
            M.MostrarUbicacion();
            if(M.getPosicionX() != L.getPosicionX()) {
                L.Caminar();
                L.MostrarUbicacion();
            }
        }
        
        System.out.println(M.getNombre() + " y " + L.getNombre() + " se encontraron!");
        M.Saludar();
        L.Saludar();
        
        return L.getPosicionX();
    }
    
    public static boolean Menu(Aldeano P,Oraculo W) {
       
       Scanner in = new Scanner(System.in);
       int posicionPrincesa = P.getPosicionX();  
        System.out.println("Oráculo Whallum, te tengo que hacer una pregunta sobre la ubicación de\n"
                + "Princesa Peach: \n 1. Posición de Princesa Peach mayor que\n 2. Posición de Princesa Peach menor que \n 3. Te arriesgas al valor ");
        int opcion = in.nextInt();
        System.out.println("Ingresa un valor ");
        int posicion = in.nextInt();
        boolean respuesta = false;
        switch (opcion) {
            case 1:
                respuesta = W.Opcion1(posicion,posicionPrincesa);
                System.out.println(respuesta);
                Menu(P, W);
                break;
            case 2:
                respuesta = W.Opcion2(posicion,posicionPrincesa);
                System.out.println(respuesta);
                Menu(P, W);
                break;
            case 3:
                respuesta= W.Opcion3(posicion,posicionPrincesa);
                        }
        return respuesta;
        
    }

      
    public static int Nivel2_etapa1(Aldeano M, Aldeano L, Aldeano P, Oraculo W) {
        
        Scanner entrada = new Scanner(System.in); 
        int siguienteNivel = P.getPosicionX();
        
        System.out.println("Por favor, elige a un personaje para jugar (Mario o Luigi): ");
        String jugadorUsuario = entrada.nextLine();
        
        do{
        if (jugadorUsuario.equalsIgnoreCase("Mario")){
        System.out.println("Bien! Has elegido a "+jugadorUsuario);
        }
        else if (jugadorUsuario.equalsIgnoreCase("Luigi")){
        System.out.println("Bien! Has elegido a "+jugadorUsuario);
        }
        else{System.out.println("El personaje elegido no es válido. \nPor favor, elige a un personaje para jugar (Mario o Luigi): ");
         jugadorUsuario = entrada.nextLine();}
        
        }while(jugadorUsuario.equalsIgnoreCase("mario")==false && jugadorUsuario.equalsIgnoreCase("Luigi")==false);
        
        if(Menu(P,W)== false){               
        siguienteNivel= 100;
        }        
        return siguienteNivel;
    }
    
    public static void Nivel2_etapa2(Aldeano M, Aldeano L, Aldeano P) {
        System.out.println("Ahora Mario y Luigi van a buscar a la princesa!");
        
        if(M.getPosicionX() < P.getPosicionX()){
            M.setOrientacion("Derecha");
        }else{
            M.setOrientacion("Izquierda");
        }
        int floresMario=0;
        
        while(M.getPosicionX()!=P.getPosicionX()){
            M.Caminar();
            System.out.println("Mario está en la posición ("+M.getPosicionX()+",0)");
            if(Math.abs(M.getPosicionX())%2==0 && Math.abs(M.getPosicionX())%7==0){
                floresMario+=1;
                System.out.println("En el casillero "+M.getPosicionX()+" Mario juntó una flor!");
            }
        }
        
        if(L.getPosicionX() < P.getPosicionX()){
            M.setOrientacion("Derecha");
        }else{
            L.setOrientacion("Izquierda");
        }
        
        int floresLuigi=0;
        
        while(L.getPosicionX()!=P.getPosicionX()){
            L.Caminar();
            System.out.println("Luigi está en la posición ("+L.getPosicionX()+",0)");
            if(Math.abs(L.getPosicionX())%3==0 && Math.abs(L.getPosicionX())%5==0){
                floresLuigi+=1;
            System.out.println("En el casillero "+L.getPosicionX()+" Luigi juntó una flor!");
            }
        }
        
        System.out.println("Mario juntó "+floresMario+" flores.");
        System.out.println("Luigi juntó "+floresLuigi+" flores.");
               
        
        if(floresMario > floresLuigi){
            System.out.println("La princesa elige a Mario!");
        }
        
        if(floresLuigi > floresMario){
            System.out.println("La princesa elige a Luigi!");
        }
        
        if(floresLuigi == floresMario){
            System.out.println("Ambos tienen la misma cantidad de flores!");
            System.out.println("La princesa tira la moneda para decidir...");
            P.lanzarMoneda();
            if(P.getMoneda()== "Cara"){
                System.out.println("Salió cara! Elige a Luigi!");
            }else{
                System.out.println("Salió cruz! Elige a Mario!");
                
            }
        }
    }
}
