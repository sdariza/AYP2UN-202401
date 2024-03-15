/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarmatriz;

import java.util.Random;

/**
 *
 * @author sdariza
 */
public class OrdenarMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random(123);// llenaremos la matriz de forma aleatoria

        int f = 10, c = 10; //dimensiones de la matriz A 
        int A[][] = new int[f + 1][c + 1];// instanciamos la matriz con las dimensiones
        int t;// variable temporal para intercambios

        //Llenamos la matriz
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                A[i][j] = random.nextInt(f * c + 1);
            }
        }

        // Mostramos la matriz sin ordenar
        System.out.println("Matriz original");
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.printf("%d|", A[i][j]);
            }
            System.out.println("");
        }
        System.out.println("********************************");
        // Algoritmo de ordamiento burbuja
        int h = 1, z = 2;//variables para controlar la posición del siguiente elemento al A_{i,j}
        for (int i = 1; i <= f; i++) { //por cada fila en A
            for (int j = 1; j <= c; j++) {// por cada columna en A de la fila i
                if (c == j) {//El siguiente elemento está en la siguiente fila
                    h++;// Avanzamos hacia la siguiente fila
                }
                /**
                 * Comparaciones hacia adelante
                 *
                 * k para las filas: comienza en la fila h
                 *
                 * l para las columnas: comienza en la columna z
                 */
                for (int k = h; k <= f; k++) {
                    for (int l = z; l <= c; l++) {
                        if (A[i][j] > A[k][l]) {
                            t = A[i][j];
                            A[i][j] = A[k][l];
                            A[k][l] = t;
                        }
                    }
                    z = 1;// se acabaron las columnas de la fila k
                }
                //Tengo elementos sobre la fila i justo antes de la última columna
                if (j + 1 < c) {
                    z = j + 2;
                }
            }

            /**
             * Ya se ordenaron todo los elementos de la fila i, z queda con el
             * valor de 1, debemos llevarla a 2
             *
             */
            z++;
        }

        // Imprimimos la matriz ordenada.
        System.out.println("Matriz ordenada");

        for (int i = 1; i <= A.length - 1; i++) {
            for (int j = 1; j <= A[i].length - 1; j++) {
                System.out.printf("%d|", A[i][j]);
            }
            System.out.println("");
        }
    }

}
