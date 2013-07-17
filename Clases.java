/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Clases {

    String nombres;
    String apellidos;
    String direccion;
    String lugarNacimiento;
    int edad;

    public void setNombres(String x) {
        nombres = x;
    }

    public void setApellidos(String x) {
        apellidos = x;
    }

    public void setDireccion(String x) {
        direccion = x;
    }

    public void setLugarNacimiento(String x) {
        lugarNacimiento = x;
    }

    public void setEdad(int x) {
        edad = x;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getlugarNacimiento() {
        return lugarNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Clases e1 = new Clases();
        e1.setNombres("Nombres");
        e1.setApellidos("Saca");
        e1.setDireccion("loja");
        e1.setLugarNacimiento("loja");
        
    }
}