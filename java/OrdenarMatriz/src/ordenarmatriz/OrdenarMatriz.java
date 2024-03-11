/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarmatriz;

/**
 *
 * @author sdariza
 */
public class OrdenarMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Matriz de prueba
        int A[][] = { { 0, 0, 0, 0 }, { 0, 3, 2, 1 }, { 0, 5, -10, 0 }, { 0, 1, 5, 20 } };
        int t;// variable temporal para intercambios

        // Algoritmo de ordamiento burbuja de forma genérica -- Se puede mejorar
        for (int i = 1; i <= A.length - 1; i++) {
            for (int j = 1; j <= A[i].length - 1; j++) {
                for (int k = 1; k <= A.length - 1; k++) {
                    for (int l = 1; l <= A[k].length - 1; l++) {
                        if (A[i][j] < A[k][l]) {
                            t = A[i][j];
                            A[i][j] = A[k][l];
                            A[k][l] = t;
                        }
                    }
                }
            }
        }
        // En la siguiente clase veremos la forma de interactuar con los subíndices.

        // Imprimimos la matriz ordenada.

        for (int i = 1; i <= A.length - 1; i++) {
            for (int j = 1; j <= A[i].length - 1; j++) {
                System.out.printf("%d|", A[i][j]);
            }
            System.out.println("");
        }
    }

}
