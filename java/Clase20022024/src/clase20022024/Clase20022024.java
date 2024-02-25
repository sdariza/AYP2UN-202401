/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase20022024;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class Clase20022024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar la sucesión de Fibonacci utilizando vectores

        // Lectura e invertir un vector
        Scanner input = new Scanner(System.in); // leer datos del teclado
        int v[] = new int[101], n, i; // declaramos las variables a utilizar
        System.out.print("Ingrese la dimensión del vector: ");
        n = input.nextInt();
        //Validamos que la dimensión a utilizar no exceda la reservada en memoria
        while (n < 1 || n > 100) {
            System.out.print("\nIngrese la dimensión del vector: \n");
            n = input.nextInt();
        }
        input.close();
        //Almacenamos los valores semilla
        v[1] = 0;
        v[2] = 1;

        // Generamos la sucesión para valores tales que n > 1
        for (i = 3; i <= n; i++) {
            v[i] = v[i - 1] + v[i - 2];
        }

        // Imprimos el vector resultante (invertido)
        System.out.println("\nEl vector con la sucesión de Fibonacci es: ");
        for (i = 1; i <= n; i++) {
            System.out.print(v[i] + "|");
        }

        System.out.println("");
    }

}
