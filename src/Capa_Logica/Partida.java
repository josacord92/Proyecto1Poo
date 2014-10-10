/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Logica;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Partida implements Serializable {
    private int oro;
    private int nivelDelJugador;
    private ArrayList<Guerrero> ejercito;
    
    public Partida(int oro, int nivelDelJugador, ArrayList<Guerrero> ejercito){
   // this.oro = oro;
   // this.nivelDelJugador = nivelDelJugador;
   // this.ejercito = ejercito;
    setOro(oro);
    setNivelDelJugador(nivelDelJugador);
    setEjercito(ejercito);
    }
    
    public void setOro(int pOro){
    oro = pOro;
    }
    
    public void setNivelDelJugador(int pNivelDelJugador){
    nivelDelJugador = pNivelDelJugador;
    }
    
    public void setEjercito(ArrayList<Guerrero> pEjercito){
    ejercito = pEjercito;
    }
    
    public int getOro(){
    return this.oro;
    }
    
    public int getNivelDelJugador(){
    return this.nivelDelJugador;
    }
    
    public ArrayList<Guerrero> getGuerreros(){
    return this.ejercito;
    }
}
