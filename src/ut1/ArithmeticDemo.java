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
public class ArithmeticDemo {
    public static void main(String[] args){
        int result = 1 + 2;
        System.out.println(result);
        
        result = result -1;
        System.out.println(result);
        
        result = result*2;
        System.out.println(result);
        
        result = result/2;
        System.out.println(result);
        
        result = result +8;
        result = result %7;
        System.out.println(result);
        
        int a = 5;
        int i = 3;
        a+=++i;
        System.out.println(a);
    }
}
