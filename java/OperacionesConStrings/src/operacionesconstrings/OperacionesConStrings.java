/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesconstrings;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class OperacionesConStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /**
         * Operaciones básicas Concatenación (+)
         */
        String x = "", y = null, z = "", concat = "";
        System.out.println("Ingrese la frase para la variable x");
        x = input.nextLine();
        System.out.println("Ingrese la frase para la variable y");
        y = input.nextLine();
        System.out.println("Ingrese la frase para la variable z");
        z = input.nextLine();
        input.close();
        concat = x + y + z;
        System.out.println("Las cadenas concatenadas x+y+z son: " + concat);

        /**
         * LONG: calcula la longitud de la cadena.
         */
        System.out.println("La longitud de las cadenas concatenadas x+y+z es: " + concat.length());

        /**
         * SUBSTR(cad, pos_inicial, #caracteres), en el lenguaje esta función es
         * diferente, ya que el #caracteres está dado por el índice final.
         */
        for (int i = 0; i < concat.length(); i++) {
            System.out.println(concat.substring(i, i + 1));
        }
        System.out.println(concat.substring(3, 5));

        /**
         * Caracter(cad,pos)
         */
        for (int i = 0; i < concat.length(); i++) {
            System.out.println(concat.charAt(i));

        }
        System.out.println(concat.charAt(4));
        //for (int i = 0; i < concat.length(); i++) {
        //    System.out.println(concat.charAt(i) == concat.substring(i, i + 1));
        //}
        /**
         * VAL("21323")
         */
        System.out.println(Integer.parseInt("125425"));

        System.out.println(Double.parseDouble("123154584.5648545"));

        /**
         * STR(5121152)-- "52121152"
         */
        System.out.println(Integer.toString(5121152) + " numero en str");
        System.out.println(Double.toString(123154584.5648545) + " numero en str");

    }

}
