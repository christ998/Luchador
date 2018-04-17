import java.util.Random;
import java.util.Scanner;

public class Luchador{
             
     int atk;
     int def;
     int vida;
     int vel;
     int rango;
     String nombre;
     String faccion;
    
    public Luchador(){
     this.rango = estrellas();
     this.atk = atk()*this.rango; 
     this.def = defensa()*this.rango;
     this.vel = vel()*this.rango;
     this.vida = vida()*this.rango;
     this.nombre = elegirNombre(nombres());
     this.faccion = elegirFaccion(faccion());
     }
     public static void main (String [] args){
     Luchador peleador = new Luchador();
     peleador.mostrar();
     
     }
            
     public String[] nombres(){
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
     faccion[0]="Agua";
     faccion[1]="Fuego";
     faccion[2]="Tierra";
     return faccion;
    }
    public static String elegirFaccion(String[]faccion){
     int i = (int)(Math.random()*2);
     String tipo = faccion[i];
     return tipo;
    }
    
    public int estrellas(){
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
    public int atk(){
     this.atk = (int)(Math.random()*50+20);
     return this.atk;
    }
    public int vida(){
     this.vida = (int)(Math.random()*300+200);
     return this.vida;
    }
    public int defensa(){
     this.def = (int)(Math.random()*20+5);
     return this.def;
    }
    public  int vel(){
     this.vel = (int)(Math.random()*90+10);
     return this.vel;
    }
    
    public void mostrar(){
     System.out.println("Nombre "+this.nombre+"\n"+"Ataque: "+this.atk+"\n"+"Defensa: "+this.def+"\n"+"Vida: "+this.vida+"\n"+"Facción: "+this.faccion+"\n"+"Vel: "+this.vel);
        
    }
    
    
    }