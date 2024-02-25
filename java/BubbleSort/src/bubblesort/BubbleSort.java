/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Random;

/**
 *
 * @author USER
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Definimos el tamaño del vector
        int n = 20, t; // Por ejemplo, un vector de tamaño 10

        // Creamos el vector para almacenar los datos aleatorios
        int[] v = new int[n + 1];

        // Generamos datos aleatorios para el vector
        Random random = new Random();
        for (int i = 1; i <= n; i++) {
            v[i] = random.nextInt(n+10); // Números aleatorios entre 0 y 99
        }

        // Imprimimos los datos del vector
        System.out.println("Datos aleatorios en el vector:");
        for (int i = 1; i <= n; i++) {
            System.out.print(v[i] + "|");
        }
        System.out.println();

        // Ordenamiento
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                if (v[j] > v[j + 1]) {
                    t = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = t;
                }
            }
        }
        // Imprimimos los datos del vector ordenado
        System.out.println("Datos ordenados por bubble sort en el vector:");
        for (int i = 1; i <= n; i++) {
            System.out.print(v[i] + "|");
        }
        System.out.println();

    }

}
