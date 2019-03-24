/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut1;

import java.io.*;

/**
 *
 * @author Agroa
 */
public class ManejadorArchivos {

    public void leerArchivo(String nombreCompletoArchivo) {
        FileReader fr;
        try {
            fr = new FileReader(nombreCompletoArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                System.out.println(lineaActual);
                lineaActual = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
    }

    public void escribirArchivo(String nombreCompletoArchivo, String[] listaLineasArchivo) {
        FileWriter fw;
        try {
            fw = new FileWriter(nombreCompletoArchivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaLineasArchivo.length; i++) {
                String lineaActual = listaLineasArchivo[i];
                bw.write(lineaActual);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ManejadorArchivos mgr = new ManejadorArchivos();
        String[] listaLineasArchivo = {"Linea 1", "Linea 2", "Linea 3", "Linea 4"};
        mgr.escribirArchivo ("C:\\Users\\Agroa\\OneDrive\\Documentos\\archivo.txt", listaLineasArchivo);
        mgr.leerArchivo ("C:\\Users\\Agroa\\OneDrive\\Documentos\\archivo.txt");
    }
}

