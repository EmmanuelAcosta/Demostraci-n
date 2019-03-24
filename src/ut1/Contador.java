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
public class Contador {
    public final int MAX_CONT = 50;
    public int contador = 1;
    public int incremento = 1;
    
    public void retornarContador(){
        while(this.contador<=this.MAX_CONT){
            this.contador+=1;
            System.out.println(contador);
        }
    }
    public void retornarContador2(){
        do{
            this.contador+=1;
            System.out.println(contador);
        }
        while(this.contador<=this.MAX_CONT);
    }
    public void retornarContador3(){
        
        for(int i = this.contador;i <=this.MAX_CONT; i++){
            this.contador+= incremento;
            System.out.println(this.contador);
        }
    }
    public static void main(String[] args){
        Contador contador = new Contador();
        contador.retornarContador3();
    }
}
