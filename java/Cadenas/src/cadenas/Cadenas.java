/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in); // Declarar variables de tipo cadena 
        String primerNombre = "";
        String segundoNombre = "";
        String PrimerApellido = "";
        String segundoApellido = ""; //Imprimir el estado inicial 
        System.out.println(primerNombre + segundoNombre
                + PrimerApellido + segundoApellido); //Añadir datos a una cadena.
        System.out.println("Ingrese su primer nombre");
        primerNombre
                = input.nextLine();
        System.out.println(primerNombre + segundoNombre
                + PrimerApellido + segundoApellido); // LONG(x): retorna el número de carácteres de una cadena
        System.out.println(primerNombre.length());

        // Substring
        System.out.println(primerNombre.substring(0, primerNombre.length()));

        //
        String x = "Barranquilla";
        System.out.println("La cadena es: " + x);
        System.out.println("La longitud de la cadena es: " + x.length());
        // Substring(pos_inicial, posfinal-1)
        System.out.println("x.substring(0, 4): " + x.substring(0, 4));

        System.out.println("x.substring(2, 10): " + x.substring(2, 10));
        x = "Colombia";
        System.out.println("La cadena es: " + x);
        System.out.println("La longitud de la cadena es: " + x.length());
        System.out.println("x.substring(4, 7): " + x.substring(4, 7));

        //input.close();
        char l;
        l = ' ';

        System.out.println("caracter(x,3): " + x.charAt(3));
        System.out.println("Ascii(x,3): " + (int) x.charAt(3));

        int z = x.charAt(3);
        System.out.println("Ascii(x,3): " + z);

    }

}
