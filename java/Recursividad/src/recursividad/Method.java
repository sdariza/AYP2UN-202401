/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author arteagama
 */
public class Method {

    Scanner input = new Scanner(System.in);

    void generarVectorFibR(int[] v, int i, int n) {
        if (i < n) {
            v[i] = v[i - 1] + v[i - 2];
            //v[i] = fibo(i);
            generarVectorFibR(v, i + 1, n);
        }
    }

    void imprimirVector(int[] v, int i, int n) {
        if (i < n) {
            System.out.print(v[i] + "|");
            imprimirVector(v, i + 1, n);
        } else {
            System.out.println("");
        }
    }

    int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    void leerMatrizR(int[][] A, int n, int m, int i, int j) {
        if (i < n) {
            if (j < m) {
                System.out.printf("Ingrese el elemento %d,%d ", i,j);
                A[i][j] = input.nextInt();
                leerMatrizR(A, n, m, i, j + 1);
            } else {
                leerMatrizR(A, n, m, i + 1, 0);
            }
        }
    }

    void imprimirMatrizR(int[][] A, int n, int m, int i, int j) {
        if (i < n) {
            if (j < m) {
                System.out.print(A[i][j]+"|");
                imprimirMatrizR(A, n, m, i, j+1);
            } else {
                System.out.println("");
                imprimirMatrizR(A, n, m, i + 1, 0);
            }
        }
    }

    void multiMatrizR(int[][] A, int[][] B, int[][] C, int n, int m, int p, int i, int j, int k) {
        if (i < n) {// Si tengo filas por llenas
            if (j < p) {//Si tengo columnas por llenar
                if (k < m) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    multiMatrizR(A, B, C, n, m, p, i, j, k + 1);
                } else {
                    multiMatrizR(A, B, C, n, m, p, i, j + 1, 0);
                }
            } else {
                multiMatrizR(A, B, C, n, m, p, i + 1, 0, 0);
            }
        }
    }
}
