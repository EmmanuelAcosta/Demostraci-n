/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo1;

/**
 *
 * @author Agroa
 */
public class Carta {
    public String palo;
    public int numero;
    public Carta(String palo, int numero){
        this.palo = palo;
        this.numero = numero;
    }
    public String getPalo(){
        return palo;
    }
    public int getNumero(){
        return numero;
    }
    public String toString(){
        return numero + " " + palo;
    }
    
}
