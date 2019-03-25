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
public class Mazo {
    private final int cantidadCartas = 48;
    private int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12};
    private String palos [] = {"Espada","Basto","Oro","Copa"};
    public Carta[] mazo(){
        Carta[] mazoCartas = new Carta[50];
        int contador = 0;
        for(int i=0; i<numeros.length;i++){
            for(int e = 0; e<palos.length; e++){
                
                Carta carta = new Carta(palos[e],numeros[i]);
                mazoCartas[contador] = carta;
                contador+=1;
                System.out.println(carta.toString());
            }
        }return mazoCartas;
    }
    
    
}
