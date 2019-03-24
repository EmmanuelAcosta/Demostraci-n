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
public class HojaTrabajo1 {
    String nombre;
    int valor;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.mazo();
    }
    public String getNombre(){
        return nombre;
    }
    public int getValor(){
        return valor;
    }
    public String imprimirValor(){
        System.out.println(getValor());
        return "" + getValor();
    }
    
}
