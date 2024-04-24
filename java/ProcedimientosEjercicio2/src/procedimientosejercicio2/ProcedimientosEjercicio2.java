/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procedimientosejercicio2;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ProcedimientosEjercicio2 {

    Scanner input = new Scanner(System.in);

    /**
     * Lectura de una matriz
     *
     * @param A: variable matriz
     * @param n: # de filas y columnas
     */
    void readMatrix(int A[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("\nIngrese la pos [%d,%d]\n", i, j);
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("");
    }

    /**
     * Imprime la matrix
     *
     * @param A: Variable matriz
     * @param n: dimension cuadrada
     */
    void printMatrix(int A[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    /**
     * Método para sumar dos matrices: A+B = C
     *
     * @param A: Variable matriz
     * @param B: Variable Matriz
     * @param n: Dimensión de las matrices
     * @param C: Variable matriz
     * @param signo: Determina la suma o la resta
     */
    void sumarRestarMatriz(int A[][], int B[][], int n, int C[][], int signo) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + signo * B[i][j];
            }
        }
    }

    /**
     * Método para multiplicar matrices
     *
     * @param A: Variable matriz
     * @param B: Variable matriz
     * @param n: dimensión de la matriz
     * @param C : Matriz con el producto AB=C
     */
    void multiplicarMatrices(int A[][], int B[][], int n, int C[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProcedimientosEjercicio2 ob = new ProcedimientosEjercicio2();
        int A[][], B[][], C[][], D[][], n, E[][], F[][];
        System.out.println("Ingrese la dimensión de las matrices");
        n = ob.input.nextInt();
        A = new int[n][n];
        B = new int[n][n];
        C = new int[n][n];
        D = new int[n][n];
        E = new int[n][n];
        F = new int[n][n];
        System.out.println("Leer matriz A");
        ob.readMatrix(A, n);
        System.out.println("Leer matriz B");
        ob.readMatrix(B, n);
        System.out.println("Matriz A");
        ob.printMatrix(A, n);
        System.out.println("Matriz B");
        ob.printMatrix(B, n);
        ob.sumarRestarMatriz(A, B, n, C, 1);
        System.out.println("A+B=C");
        ob.printMatrix(C, n);
        ob.multiplicarMatrices(C, A, n, D);
        ob.sumarRestarMatriz(A, B, n, E, -1);
        ob.multiplicarMatrices(E, B, n, F);
        System.out.println("(A+B)A");
        ob.printMatrix(D, n);
        System.out.println("(A-B)B");
        ob.printMatrix(F, n);
    }

}
