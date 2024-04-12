/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 1, n = 0;
        Scanner input = new Scanner(System.in);//Declaración de la variable input para leer valores de consola
        do {
            if (op == 1) {
                System.out.println("Digite la dimensión de la matriz cuadrada");
                n = input.nextInt();
            } else {
                System.out.println("La dimensión es: " + n);
            }

            int s1 = 0, s2 = 0;
            int AA[][] = new int[n + 1][n + 1];
            int B[][] = new int[n + 1][n + 1];
            int C[][] = new int[n + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("Ingrese el elemento A[%d,%d]", i, j);
                    AA[i][j] = input.nextInt();
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("Ingrese el elemento B[%d,%d]", i, j);
                    B[i][j] = input.nextInt();

                }
            }
            for (int i = 1; i <= n; i++) {
                s1 = s1 + AA[i][i];
                s2 = s2 + B[i][n - i + 1];
            }

            if (s1 > s2) {
                int v[] = new int[(n + 1) * (n + 1)];
                int p = 0;
                System.out.println("La sumatoria en A fue mayor a la de B");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        for (int k = 1; k <= n; k++) {
                            C[i][j] = C[i][j] + AA[i][k] * B[k][j];
                        }
                        if (AA[i][j] % 2 == 0) {
                            boolean sw = false;
                            int ii = 1;
                            while (!sw && ii <= p) {
                                if (v[ii] == AA[i][j]) {
                                    sw = true;
                                } else {
                                    ii++;
                                }
                            }
                            if (!sw) {
                                p++;
                                v[p] = AA[i][j];
                            }
                        }

                        if (B[i][j] % 2 == 0) {
                            boolean sw = false;
                            int ii = 1;
                            while (!sw && ii <= p) {
                                if (v[ii] == B[i][j]) {
                                    sw = true;
                                } else {
                                    ii++;
                                }
                            }
                            if (!sw) {
                                p++;
                                v[p] = B[i][j];
                            }
                        }
                    }
                }

                System.out.println("Resultados:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(C[i][j] + "|");
                    }
                    System.out.println("");
                }
                System.out.println("Vector de pares");
                for (int i = 1; i <= p; i++) {
                    System.out.print(v[i] + "|");
                }
                System.out.println("");

            } else if (s1 < s2) {
                int v[] = new int[(n + 1) * (n + 1)];
                int p = 0;
                System.out.println("La sumatoria en A fue menor a la de B");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        C[i][j] = -AA[i][j] + B[i][j];
                        if (AA[i][j] % 2 == 1) {
                            boolean sw = false;
                            int ii = 1;
                            while (!sw && ii <= p) {
                                if (v[ii] == AA[i][j]) {
                                    sw = true;
                                } else {
                                    ii++;
                                }
                            }
                            if (!sw) {
                                p++;
                                v[p] = AA[i][j];
                            }
                        }

                        if (B[i][j] % 2 == 1) {
                            boolean sw = false;
                            int ii = 1;
                            while (!sw && ii <= p) {
                                if (v[ii] == B[i][j]) {
                                    sw = true;
                                } else {
                                    ii++;
                                }
                            }
                            if (!sw) {
                                p++;
                                v[p] = B[i][j];
                            }
                        }
                    }
                }

                System.out.println("Resultados:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(C[i][j] + "|");
                    }
                    System.out.println("");
                }
                System.out.println("vector de impares");
                for (int i = 1; i <= p; i++) {
                    System.out.print(v[i] + "|");
                }
                System.out.println("");
            } else {
                int v[] = new int[(n + 1) * (n + 1)];
                int p = 0;
                int tt = 0;
                System.out.println("La sumatoria en A fue igual a la de B");
                for (int i = 1; i <= n - 1; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        tt = AA[i][j];
                        AA[i][j] = AA[n - j + 1][n - i + 1];
                        AA[n - j + 1][n - i + 1] = tt;
                    }
                }
                for (int i = 2; i <= n; i++) {
                    for (int j = 1; j <= i - 1; j++) {
                        tt = B[i][j];
                        B[i][j] = B[j][i];
                        B[j][i] = tt;
                    }
                }

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        for (int k = 1; k <= n; k++) {
                            C[i][j] = C[i][j] + AA[i][k] * B[k][j];
                        }
                        int contDiv = 0, ii = 1;
                        while (ii <= C[i][j] && contDiv <= 2) {
                            if (C[i][j] % ii == 0) {
                                contDiv++;
                            }
                            ii++;
                        }
                        if (contDiv == 2) {
                            boolean sw = false;
                            ii = 1;
                            while (!sw && ii <= p) {
                                if (v[ii] == C[i][j]) {
                                    sw = true;
                                } else {
                                    ii++;
                                }
                            }
                            if (!sw) {
                                p++;
                                v[p] = C[i][j];
                            }
                        }

                    }
                }

                System.out.println("Resultados:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(C[i][j] + "|");
                    }
                    System.out.println("");
                }
                System.out.println("Vector de primos");
                for (int i = 1; i <= p; i++) {
                    System.out.print(v[i] + "|");
                }
                System.out.println("");
            }
            System.out.println("¿Desea probar otra dimensión o stop: 1=otra dim, 2=stop, 3=probar con la misma dim");
            op = input.nextInt();
            System.out.println("");
        } while (op == 1 || op == 3);
        input.close();
    }

}
