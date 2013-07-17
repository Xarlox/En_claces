/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 // */
package claces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlitos Saca
 */
public class Tablas {

    public static void main(String[] args) throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar el numero deseado");
        int Numero = Integer.parseInt(lectura1.readLine());
        System.out.println("Tabla del " + Numero );
        System.out.println("");
        {
      
            respSuma(Numero, 0);      
            System.out.println("");
            respResta(Numero, 0); 
            System.out.println("");
            respMult(Numero, 0); 
            System.out.println("");
            respDiv(Numero, 0);
        }
    }

    public static void respSuma(int H, int Contador) {
        Contador++;
        if (Contador <= 12) {
            int resp = H+Contador;
            System.out.println("Suma: "+H + "+" + Contador + "=" + resp);
            respSuma(H, Contador);
        }
    }

    public static void respResta(int H, int Contador) {   
        Contador++;
        if (Contador <= 12) {
            int resp = H - Contador;
            System.out.println("Resta: "+H + "-" + Contador + "=" + resp);
            respResta(H, Contador);
        }
    }

    public static void respMult(int H, int Contador) {       
        Contador++;
        if (Contador <= 12) {
            System.out.println("Multiplicacion: "+H + "x" + Contador + "=" +H*Contador);
            respMult(H, Contador);
        }
    }

    public static void respDiv(int H, int Contador) {        
        Contador++;
        if (Contador <= 12) {
            float resp = H / Contador;
            System.out.println("Divicion: "+H + "/" + Contador + "=" + resp);
            respDiv(H, Contador);
        }
    }
}