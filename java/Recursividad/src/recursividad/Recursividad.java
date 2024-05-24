/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author arteagama
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Method myMethods = new Method();


        int nn = 3;
        int m = 4;
        int p = 2;
        int A[][] = new int[nn][m];
        int B[][] = new int[m][p];
        int C[][] = new int[nn][p];

        System.out.println("Ingrese A");
        myMethods.leerMatrizR(A, nn, m, 0, 0);
        System.out.println("Ingrese B");
        myMethods.leerMatrizR(B, m, p, 0, 0);
        myMethods.multiMatrizR(A, B, C, nn, m, p, 0, 0, 0);
        myMethods.imprimirMatrizR(C, nn, p, 0, 0);
    }

}
