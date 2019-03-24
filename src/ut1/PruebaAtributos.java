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
public class PruebaAtributos {
    int edad;
    private String apellido;
    public String nombre;
    
    public PruebaAtributos(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String toString(){
        return "Nombre: " + this.nombre +" Apellido: " + this.apellido + " Edad: " + this.edad;
    }
}
