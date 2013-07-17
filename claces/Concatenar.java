/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claces;

/**
 *
 * @author Usuario
 */
public class Concatenar {
     public static void main(String[] args) {
        // TODO code application logic here
         String N="Carlos";
         String A="Saca";
         String y = null;
         conc(N,A);
         System.out.println("Cadena"+y);
     }
     public static String conc(String N, String A){
         String y;
         y=N+A;
         return y;
     }
}
