import java.util.Random;
import java.util.Scanner;

public class Luchador_ChristianHerrera{
    
    static String [][] stats = new String[6][16];
    
    static int b = 1;
    
    public static void main(String[] args) {
    nombres();
    Scanner leer = new Scanner(System.in);
    int opcn;
    do{    
    
    System.out.println("1.Crear luchador");
    System.out.println("2.Ver luchadores");
    System.out.println("3. Salir");
    opcn = leer.nextInt();
    switch(opcn){
     case 1: crearluchador(atk(),defensa(),vida(),vel(), elegirNombre(nombres()),elegirFaccion(faccion())); break;
             
     case 2: mostrarPeleadores();               
      }
           
     }while(opcn !=3);
     }
   
    
    public static String[] nombres(){
    String [] peleadores  = new String[15];
    peleadores[0]="Takle";
    peleadores[1]="Astryd";
    peleadores[2]="Vend";
    peleadores[3]="meshias";
    peleadores[4]="lucifer";
    peleadores[5]="Scorp";
    peleadores[6]="Jade";
    peleadores[7]="Rain";
    peleadores[8]="Reiko";
    peleadores[9]="Darius";
    peleadores[10]="Raiden";
    peleadores[11]="SubZero";
    peleadores[12]="Jax";
    peleadores[13]="yasuo";
    peleadores[14]="Garen";
    return peleadores;
    }
    public static String elegirNombre(String []peleadores){
    int i = (int)(Math.random()*15);
    String name = peleadores[i];
    return name;
    }
    
    public static String[] faccion(){
    String [] faccion = new String[3];
    faccion[0]="agua";
    faccion[1]="fuego";
    faccion[2]="tierra";
    return faccion;
    }
    public static String elegirFaccion(String[]faccion){
    int i = (int)(Math.random()*2);
    String tipo = faccion[i];
    return tipo;
    }
    public static int estrellas(){
    int estrellas = (int)(Math.random()*100);
    
    if(estrellas < 40){
    estrellas = 1;
    }
    if(estrellas >= 40 & estrellas < 70){
    estrellas = 2;   
    }
    if(estrellas >= 70 & estrellas < 85){
    estrellas = 3;
    }
    if(estrellas >= 85 & estrellas < 95){
    estrellas = 4;
    }
    if(estrellas >= 95){
    estrellas = 5;
    }
    return estrellas;
    }
    public static int atk(){
    int atk = (int)(Math.random()*50+20);
    return atk;
    }
    public static int vida(){
    int vida = (int)(Math.random()*300+200);
    return vida;
    }
    public static int defensa(){
    int def = (int)(Math.random()*20+5);
    return def;
    }
    public static int vel(){
    int vel = (int)(Math.random()*90+10);
    return vel;
    }
    public static void crearluchador(int atk, int def, int vida, int vel, String nombre, String faccion){
    System.out.println("Se creó el luchador "+nombre +",tiene "+atk + " de ataque, tiene "+def +" de defensa" + " ,tiene "+vida +" de vida"+ " ,tiene "+vel +" de velocidad"+ " ,tiene faccion "+faccion);
    
    almacenarLuchador(atk,def,vida,vel,nombre,faccion,estrellas());
    }
    public static void almacenarLuchador(int atk, int def, int vida, int vel, String nombre, String faccion, int estrellas){
    stats[0][0] = "Tabla";     
    stats[1][0] = "Ataque";
    stats[2][0] = "Defensa";
    stats[3][0] = "Vida";
    stats[4][0] = "Vel";
    stats[5][0] = "Stars";
    stats[0][b] = nombre;
    stats[1][b] = String.valueOf(atk*estrellas);
    stats[2][b] = String.valueOf(def*estrellas);
    stats[3][b] = String.valueOf(vida*estrellas);
    stats[4][b] = String.valueOf(vel*estrellas);
    stats[5][b] = String.valueOf(estrellas);
    b++; 
    }
    public static void mostrarPeleadores(){
        for(int i=0; i<stats.length; i++){
          for(int j=0; j<stats[i].length;j++){
              System.out.print(stats[i][j]+"\t"); 
          }
            System.out.println();
        }
    }
}
    

    
    
   


