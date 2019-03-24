/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut1;

import ut1.PruebaAtributos;
/**
 *
 * @author Agroa
 */
public class UT1 {

    /**
     * @param args the command line arguments
     */
    static int i;
    public static void main(String[] args) {
        // TODO code application logic here
        //PruebaAtributos pa = new PruebaAtributos("Jose","Gonzalez",34);
        //System.out.println(pa.nombre);
        //System.out.println(pa.edad);
        //System.out.println(pa.apellido);
        //System.out.println(pa);
        //int b;
        //System.out.println(i);
        //System.out.println(b);new 
        //MultSuma suma = new MultSuma();
        //MultSuma.multSuma(1.0, 2.0, 3.0);
        ContadorDePalabras nuevo = new ContadorDePalabras();
        nuevo.contadorPalabras("  a l k s j     d     a  Hola    como estas    ");
        
    }
    
}
