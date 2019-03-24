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
public class Alumno {

    private String nombre;

    public Alumno() {
        nombre = null;
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Emmanuel";
        System.out.println(alumno.getNombreAdmiracion());
        Alumno.recorrer("carajo");
        Alumno.getValor();;
        Alumno.getPrimerCaracter("carajo");
    }

    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = {6, 16, 26, 36, 46, 56, 66, 76};
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        String string[] = new String[5];
        string[0] = palabra;
        return (string[0].charAt(1));
    }

    public static String paraAString(int a) {
        Object x1 = new Integer(a);
        return String.valueOf(x1);
    }
}
