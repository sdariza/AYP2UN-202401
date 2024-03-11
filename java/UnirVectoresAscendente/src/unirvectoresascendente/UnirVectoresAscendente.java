/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unirvectoresascendente;

/**
 *
 * @author sdariza
 */
public class UnirVectoresAscendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos vectores de prueba
        int v[] = { -1, 4, 5, 7, 10, 20, 21, 40, 45 };
        int u[] = { -1, 3, 4, 7, 8, 11, 13, 22, 23 };
        int n = v.length - 1;

        /**
         * Para este ejemplo se considera la primera posición del vector
         * despreciable, es decir tenemos en cuenta índices desde el 1 hasta en n.
         */

        int t[] = new int[2 * n + 1];

        // Variables necesarias
        int i = 1, j = 1, k = 1;

        while (i <= n || j <= n) {// tenga elementos en v o u
            if (i <= n && j <= n) {// tengo elementos para comparar entre v y u
                if (v[i] < u[j]) {
                    t[k] = v[i];
                    i++;
                } else if (v[i] == u[j]) {
                    t[k] = v[i];
                    k++;
                    t[k] = u[j];
                    i++;
                    j++;
                } else {
                    t[k] = u[j];
                    j++;
                }
            } else if (i <= n) {// Aún tengo elementos en v pero no en u
                t[k] = v[i];
                i++;
            } else {// Aún tengo elementos en u pero no en v.
                t[k] = u[j];
                j++;
            }
            k++;
        }

        k--;
        // Imprimimos t
        for (int l = 1; l <= k; l++) {
            System.out.print(t[l] + "|");
        }
        System.out.println("");
    }

}
