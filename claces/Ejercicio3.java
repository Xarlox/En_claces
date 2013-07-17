/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claces;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String valor;
        int salir = 0;       
            System.out.println("Ingresar cadena");
            valor = console.nextLine();            
                    char primerCaracter = pirmerCaracter(valor);
                    String valorEnMayuscula = convertirMayusculas(valor);
                    int tamañoValor = tamañoCadena(valor);                                
                    System.out.println("Primer Caracter     "+primerCaracter);
                    System.out.println("Valor En Mayuscula  "+valorEnMayuscula);
                    System.out.println("Tamaño              "+tamañoValor);                    
    }

    public static char pirmerCaracter(String cadena) {
        return cadena.charAt(0);
    }

    public static String convertirMayusculas(String numero) {
        return numero.toUpperCase();
    }

    public static int tamañoCadena(String numero) {
        return numero.length();
    }   
}