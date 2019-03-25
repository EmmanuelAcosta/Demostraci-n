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
public class MazoEnum {
    Numero numero;
    Palo palo;
    public MazoEnum(){
        this.numero = numero;
        this.palo = palo;
        
    }
    public String[] lista(){
        String[] lista = new String[48];
        int contador = 0;
        for(Numero numero: Numero.values()){
            int contador2 = 0;
            for(Palo palo: Palo.values()){
              lista[contador] = numero.toString() + " " + palo.toString();
              System.out.println(lista[contador]);
              contador+=1;
            }
        }return lista;
    }
}
