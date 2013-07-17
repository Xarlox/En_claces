/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claces;



/**
 *
 * @author Usuario
 */
public class Carlos {
      public static void main(String[] args) {
        // TODO code application logic here
           String x="10";
           String z="11";
           String cadena ,cadena2;
           cadena =suma(x,z);
           cadena2=suma2(x,z);
        System.out.println("x="+x);
        suma(z,x);
        System.out.println("x="+x);
      }
        public static String suma2 (String z, String x){
            
            z.concat(x);
            return z;
                    } 
    
       public static String suma (String z, String x){
           String valor;
           valor =z+x;
       
        return valor;
       }
}
