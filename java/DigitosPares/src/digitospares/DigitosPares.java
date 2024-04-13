/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitospares;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class DigitosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número entero");
        int n = input.nextInt(), cont = 0;
        input.close();
        String nCad;
        input.close();
        //Si n es negativo, lo pasamos a pos
        if (n < 0) {
            n = -n;
        }
        nCad = Integer.toString(n);// STR(n)
        for (int i = 0; i < nCad.length(); i++) {
            //Integer.parseInt()--> VAL()
            //nCad.substring(i,i+1) --> SUBSTR(nCad, i,1)
            if (Integer.parseInt(nCad.substring(i, i + 1)) % 2 == 0) {
                cont++; // es lo mismo que cont+=1 en python
            }
        }
        System.out.println("El número " + n + " tiene " + cont + " de dígitos pares");
    }

}
