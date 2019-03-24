/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut1;

/**
 *
 * @author Agroa
 */
public class ContadorDePalabras {
    public int contadorPalabras(String texto){
        String textoAUsar = texto.trim();
        String textoSalida = null;
        int contador = 0;
        for(int i =0; i < textoAUsar.length(); i++){
            if(' ' ==textoAUsar.charAt(i) && i != (textoAUsar.length()-1) && textoAUsar.charAt(i+1)!= ' '){
                contador +=1;
            }
        }
        System.out.println(contador+1);
        return contador +1;
    }
    
}
