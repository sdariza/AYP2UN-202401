/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 1, n = 0;
        Scanner input = new Scanner(System.in);//Declaración de la variable input para leer valores de consola

        do {
            if (op == 1) {
                System.out.println("Ingrese la dimensión de A");
                n = input.nextInt();
            } else {
                System.out.println("La dimensión es: " + n);

            }
            int h = n + 1, z = 2, t; //Dimensión de la matriz, variables para ordenar
            int A[][] = new int[n + 1][n + 1];// Intanciamos la matriz A
            int Z[][] = new int[2 * n + 1][2 * n + 1];// Instanciamos o reservamos el espacio para la matriz Z
            Random random = new Random(123); // LLenamos con valores aleatorios la matriz A, la semilla será 123
            for (int i = 1; i < n + 1; i++) {//filas
                for (int j = 1; j < n + 1; j++) {//columnas
                    A[i][j] = random.nextInt(n * n + 1);//llenamos el respectivo valor aleatorio
                }
            }
            //mostramos la matriz A
            System.out.println("Matriz A:");
            for (int i = 1; i < n + 1; i++) {//filas
                for (int j = 1; j < n + 1; j++) {//columnas
                    System.out.printf("%d|", A[i][j]);//mostramos en consola
                }
                System.out.println("");//salto de línea para cuando se termie de ilustrar la fila i.
            }
            System.out.println("*******************");

            //Ahora llenaremos la matriz Z, lo haremos cuadrante por cuadrante.
            /**
             * Cuadrante I
             *
             * 1<=i<=n
             *
             * n+1<=j<=2n
             *
             * Se debe llenar en Z[i][j] <-- A[i][j-n]
             */
            for (int i = 1; i <= n; i++) {// filas
                for (int j = n + 1; j <= 2 * n; j++) {//columnas
                    Z[i][j] = A[i][j - n];//Llenamos la matriz Z con la transpuesta de A
                }
            }

            /**
             * Cuadrante II
             *
             * 1<=i<=n
             *
             * 1<=j<=n
             *
             * Se debe llenar en Z[i][j] <-- A[j][i]
             */
            for (int i = 1; i <= n; i++) {//filas
                for (int j = 1; j <= n; j++) {//columnas
                    Z[i][j] = A[j][i];//Llenamos a Z con la matriz A
                }
            }

            /**
             * cuadrante III
             *
             * n+1<=i<=2n
             *
             * 1<=j<=n
             *
             * Z[i][j] <-- sum_{k=1}^{n}(Z[i - n][k] * Z[k][j + n])
             */
            for (int i = n + 1; i <= 2 * n; i++) {//límites en filas del III cuadrante
                for (int j = 1; j <= n; j++) {//límites en columnas del III cuadrante
                    for (int k = 1; k <= n; k++) {//producto punto entre filas y columnas
                        Z[i][j] = Z[i][j] + Z[i - n][k] * Z[k][j + n]; // Llenamos a Z con el respectivo producto punto de ATA
                    }
                }
            }

            //Ordenamiento...
            for (int i = n + 1; i <= 2 * n; i++) { //por cada fila en A
                for (int j = 1; j <= n; j++) {// por cada columna en A de la fila i
                    if (n == j) {//El siguiente elemento está en la siguiente fila
                        h++;// Avanzamos hacia la siguiente fila
                    }
                    /**
                     * Comparaciones hacia adelante
                     *
                     * k para las filas: comienza en la fila h
                     *
                     * l para las columnas: comienza en la columna z
                     */
                    for (int k = h; k <= 2 * n; k++) {//filas siguientes
                        for (int l = z; l <= n; l++) {// columnas siguientes
                            if (Z[i][j] > Z[k][l]) {//comparamos para ir buscando el menor elemento que debería en la posición Z[i,j]
                                t = Z[i][j];
                                Z[i][j] = Z[k][l];
                                Z[k][l] = t;
                            }
                        }
                        z = 1;// se acabaron las columnas de la fila k
                    }
                    //Tengo elementos sobre la fila i justo antes de la última columna
                    if (j + 1 < n) {
                        z = j + 2;
                    }
                }
                /**
                 * Ya se ordenaron todo los elementos de la fila i, z queda con
                 * el valor de 1, debemos llevarla a 2
                 *
                 */

                z++;
            }

            /**
             * cuadrante IV
             *
             * n+1<=i<=2n
             *
             * n+1<=j<=2n
             *
             * Z[i][j] <-- A[n - (j - n) + 1][n - (i - n) + 1];
             */
            for (int i = n + 1; i <= 2 * n; i++) {//límites en filas del IV cuadrante
                for (int j = n + 1; j <= 2 * n; j++) {//límites en columnas del IV cuadrante
                    Z[i][j] = A[n - (j - n) + 1][n - (i - n) + 1];
                }
            }

            System.out.println("Matriz Z:");
            for (int i = 1; i <= 2 * n; i++) {
                for (int j = 1; j <= 2 * n; j++) {
                    System.out.printf("%d|", Z[i][j]);
                }
                System.out.println("");
            }
            System.out.println("*******************");
            System.out.println("¿Desea probar otra dimensión o stop: 1=otra dim, 2=stop, 3=probar con la misma dim");
            op = input.nextInt();
            System.out.println("");

        } while (op == 1 || op == 3);
        input.close();

    }

}
