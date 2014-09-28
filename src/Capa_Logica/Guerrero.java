/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Logica;

/**
 *
 * @author Jose
 */
public abstract class Guerrero extends ElementoJugable{
    
    private double cantidadGolpesPorUnidadTiempo;
    private double costo;
    private int campoEnElEjercito;

    public double getCantidadGolpesPorUnidadTiempo(){
        return this.cantidadGolpesPorUnidadTiempo;
    }
    
    public int getCampoEnElEjercito(){
        return this.campoEnElEjercito;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public void setCantidadGolpesPorUnidadTiempo(double CantidadGolpesPorUnidadTiempo){
        this.cantidadGolpesPorUnidadTiempo = CantidadGolpesPorUnidadTiempo;
    }
    
    public void setCosto(double costo){
        this.costo = costo;
    }
    
    public void setCampoEnElEjercito(int campoEnElEjercito){
        this.campoEnElEjercito = campoEnElEjercito;
    }
    
    public abstract void atacar();
    public abstract void mover();
    
    
}
