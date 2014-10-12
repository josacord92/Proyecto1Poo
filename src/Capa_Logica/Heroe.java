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
 */
public class Heroe extends Guerrero implements Serializable {
    public static double costo;
    public static int nivelAparicion;
    public static int campoEnElEjercito;
    
    Heroe(){
    setID(this.getIDCounter());        // Se le asigna un identificador primary KEY al espadachin como identificador unico
    this.incrementarIDCounter();       // Incremento del primary key para la creacion de otros elementos en el juego    
    setNombre("Espadachin Mandoble -ID: "+getID());   //Nombre del Personaje
    setNivel(1);                       //Nivel de fuerza Con El Que Se Crea El Guerrero - Inicia en nivel 1
    setCantidadGolpesPorUnidadTiempo(20);
    setVida(50);
    }
    
    public Heroe(String nombre, int nivelDePoder, int nivelDeAparicion,double costo, int campoEnElEjercito, double cantidadDeGolpesPorUnidadDeTiempo,double vida){
    
    }
    
    public void run()
    { 
        /*
        // es lo que hilo va a hacer
        while (!detener)
        {
            
            Point punto = refPantalla.lblMovimiento.getLocation();
            
            refPantalla.lblMovimiento.setLocation(punto.x + 10, punto.y);
            
            int velocidad = Integer.parseInt(refPantalla.txfVelocidad.getText())*1000;
            
            
            
            try {
                sleep(velocidad);
            } catch (InterruptedException ex) {
            
            }
            
            while (pausa)
            {
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    //Logger.getLogger(HiloMover.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
    */
    }
    public  void atacar(){};
    public void mover(){};
}
