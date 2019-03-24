/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo1;

import java.awt.Rectangle;

/**
 *
 * @author Agroa
 */
public class SomethingIsWrong {
    public double area(double lado, double ancho){
        double area = 0;
        area = lado*ancho;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
        Rectangle myRect = null;
        SomethingIsWrong some = new SomethingIsWrong();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + some.area(myRect.width, myRect.height));
    }
}
