/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productomatrices;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ProductoMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Instanciamos las matrices A, B y C.
        int A[][] = new int[101][101];
        int B[][] = new int[101][101];
        int C[][] = new int[101][101];

        // Variables para las dimensiones.
        int n, m, p, q;
        System.out.println("Digite el valor de las filas en A");
        n = input.nextInt();
        System.out.println("Digite el valor de las columnas en A");
        m = input.nextInt();
        System.out.println("Digite el valor de las filas en B");
        p = input.nextInt();
        System.out.println("Digite el valor de las columnas en B");
        q = input.nextInt();

        // Si el número de columnas de A es igual al número de filas de B
        if (m == p) {
            // Lectura de A
            for (int i = 1; i <= n; i = i + 1) {
                for (int j = 1; j <= m; j++) {
                    System.out.printf("\nIngrese A[%d,%d]\n", i, j);
                    A[i][j] = input.nextInt();
                }
            }
            // Lectura de B
            for (int i = 1; i <= p; i++) {
                for (int j = 1; j <= q; j++) {
                    System.out.printf("\nIngrese B[%d,%d]\n", i, j);
                    B[i][j] = input.nextInt();
                }
            }
            // Cerramos el input.
            input.close();

            // Calculamos el producto AB
            for (int i = 1; i <= n; i++) {// Filas de C
                for (int j = 1; j <= q; j++) {// Columnas de C
                    C[i][j] = 0;
                    for (int k = 1; k <= p; k++) {// Producto punto entre las filas de A y las columnas de B
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                }
            }

            // Imprimos la matriz C = AB
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= q; j++) {
                    System.out.printf("%d|", C[i][j]);
                }
                System.out.println("");
            }
        }
    }

}
