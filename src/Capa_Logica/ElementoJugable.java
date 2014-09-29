/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Logica;
import java.io.Serializable;
/**
 *
 * @author Jose
 * 
 * Elemento Jugable comprende cualquier elemento
 * que pueda desarrollar una accion en el juego
 * esto no incluye edificios que esten estaticos 
 * o sin algun ataque
 */
public abstract class ElementoJugable extends Thread implements Serializable{
    private double ID;
    private String nombre; 
    private double vida;
    private boolean detener;
    private int nivelAparicion; //Nivel en el cual el jugador puede hacer uso de dicho elemento
    private int nivel; // Nivel que posee dicho elemento (potencia sus caracteristicas)
    private static double IDCounter = 1;
    
    public abstract void run();
    
     public void detener()
    {
        this.detener = true;
    }
    
    public double getIDCounter(){
        return this.IDCounter;
    }
    
    public double getID(){
        return this.ID;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public double getVida(){
        return this.vida;
    }
    
    public int getNivelAparicion(){
        return this.nivelAparicion;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    
    public void setVida(double vida){
    
        this.vida = vida;
    }
    
    public void setNivelAparicion(int nivelAparicion){
    
        this.nivelAparicion = nivelAparicion;
    }
    
    public void setNivel(int nivel){
    
        this.nivel = nivel;
    }
    
    public void setID(double ID){
    this.ID = ID;
    }
    
    public void incrementarIDCounter(){
        this.IDCounter++;
    }
    
}
