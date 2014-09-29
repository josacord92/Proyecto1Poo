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
public class Jugador implements Serializable{
    
    //ArrayList<Partida> partidasDelJugador = new ArrayList<Partida>();
    //Credencial miIdentificacion = new Credencial();
    ArrayList<Partida> partidasDelJugador;
    Credencial miIdentificacion;
    
    Jugador(){
   partidasDelJugador = new ArrayList<Partida>();
   miIdentificacion = new Credencial();
    }
}
