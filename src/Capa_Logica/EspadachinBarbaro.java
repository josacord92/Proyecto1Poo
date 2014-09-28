/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica;

/**
 *
 * @author curso
 */
public class EspadachinBarbaro extends GuerreroDeContacto{
    
    public static double costo = 10;
    public static int nivelAparicion = 1;
    public static int campoEnElEjercito = 1;
    
    EspadachinBarbaro(){
    setID(this.getIDCounter());        // Se le asigna un identificador primary KEY al espadachin como identificador unico
    this.incrementarIDCounter();       // Incremento del primary key para la creacion de otros elementos en el juego    
    setNombre("Espadachin Barbaro -ID: "+getID());   //Nombre del Personaje
    setNivel(1);                       //Nivel de fuerza Con El Que Se Crea El Guerrero - Inicia en nivel 1
    setCantidadGolpesPorUnidadTiempo(10);
    setVida(20);
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
    public void atacar(){
    
    }
    
    public void mover(){
    
    }
}
