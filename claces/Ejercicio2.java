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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String valor;
        int salir = 0;
        do {
            System.out.println("Ingresar cadena");
            valor = console.nextLine();
            if (valor.length() > 10) {
                if (valor.length() < 15) {
                    char primerCaracter = pirmerCaracter(valor);
                    String valorEnMayuscula = convertirMayusculas(valor);
                    int tamañoValor = tamañoCadena(valor);
                    char ultimoCaracter = ultimoCaracter(valor);
                    System.out.println("Primer Caracter     " + primerCaracter);
                    System.out.println("Valor En Mayuscula  " + valorEnMayuscula);
                    System.out.println("Tamaño              " + tamañoValor);
                    System.out.println("Ultimo Caracter     " + ultimoCaracter);
                } else {
                    System.out.println("Ingresar una cadena menor a 15");
                }
            } else {
                System.out.println("Ingresar una cademana mayor a 10");
            }
        } while (valor.length() != 0);
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

    public static char ultimoCaracter(String cadena) {
        int n = 0;
        n = cadena.length();
        return cadena.charAt(n - 1);
    }
}
