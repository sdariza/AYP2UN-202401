/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase14022024;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class Clase14022024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lectura e invertir un vector
        Scanner input = new Scanner(System.in); // leer datos del teclado
        int v[] = new int[101], n, i, t; // declaramos las variables a utilizar
        System.out.print("Ingrese la dimensión del vector: ");
        n = input.nextInt();

        //Validamos que la dimensión a utilizar no exceda la reservada en memoria
        while (n < 1 || n > 100) {
            System.out.print("\nIngrese la dimensión del vector: \n");
            n = input.nextInt();
        }

        //Leemos los datos sobre el vector
        for (i = 1; i <= n; i++) {
            System.out.printf("\nIngrese el valor de v[%d]: \n", i);
            v[i] = input.nextInt();
        }

        input.close();

        // Imprimos los valores almacenados en el vector
        System.out.println("Los elementos leidos son: ");
        for (i = 1; i <= n; i++) {
            System.out.print(v[i] + "|");
        }

        // Procedemos a implementar el código para invertir los elementos del vector leído
        for (i = 1; i <= n / 2; i++) {
            t = v[i];
            v[i] = v[n - i + 1];
            v[n - i + 1] = t;
        }

        // Imprimos el vector resultante (invertido)
        System.out.println("\nEl vector con los elementos invertidos es: ");
        for (i = 1; i <= n; i++) {
            System.out.print(v[i] + "|");
        }

        System.out.println("");

    }

}
