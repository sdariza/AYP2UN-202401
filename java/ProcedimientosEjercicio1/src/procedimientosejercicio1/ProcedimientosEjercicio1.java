/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimientosejercicio1;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ProcedimientosEjercicio1 {

    Scanner input = new Scanner(System.in);

    /**
     * Función para leer una variable entera
     *
     * @param variable
     * @return
     */
    int readVariable(String variable) {
        System.out.printf("Ingrese la variable %s", variable);
        return input.nextInt();
    }

    /**
     * Subrutina para leer vectores de enteros
     *
     * @param vector
     * @param dim
     */
    void readVector(int vector[], int dim) {
        for (int i = 1; i < dim + 1; i++) {
            System.out.printf("Ingrese v[%d]", i);
            vector[i] = input.nextInt();
        }
    }

    /**
     * Subrutina para imprimir vectores de enteros
     *
     * @param vector
     * @param dim
     */
    void printVector(int vector[], int dim) {
        for (int i = 1; i < dim + 1; i++) {
            System.out.printf("%d|", vector[i]);
        }
        System.out.println("");
    }

    /**
     * Función para generar el vector con los estudiantes que perdieron ambas
     * asignaturas
     *
     * @param a: vector con códigos de los estudiantes que perdieron alg 1
     * @param b: vector con códigos de los estudiantes que perdieron cal 1
     * @param n: número de estudiantes que perdieron alg 1
     * @param m: número de estudiantes que perdieron cal 1
     * @param c: vector con códigos de los estudiantes que perdieron ambas
     * materias
     * @param k: número de estudiantes que perdieron ambas materias
     * @return: k
     */
    int vectorAmbas(int a[], int b[], int n, int m, int c[], int k) {
        for (int i = 1; i < n + 1; i++) {
            int j = 1;
            boolean sw = false;
            while (!sw && j <= m) {
                if (a[i] == b[j]) {
                    k++;
                    c[k] = a[i]; // puede ser a[i] o b[j]
                    sw = true;
                    System.out.println(k);
                } else {
                    j++;
                }
            }
        }
        return k;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProcedimientosEjercicio1 ob = new ProcedimientosEjercicio1();
        int a[], b[], c[], k = 0, n, m;
        n = ob.readVariable("n");
        a = new int[n + 1];
        m = ob.readVariable("m");
        b = new int[m + 1];
        ob.readVector(a, n);
        System.out.println("Vector de estudiantes que perdieron alg 1");
        ob.printVector(a, n);
        ob.readVector(b, m);
        System.out.println("Vector de estudiantes que perdieron cal 1");
        ob.printVector(b, m);
        c = (n > m) ? new int[n + 1] : new int[m + 1];
        k = ob.vectorAmbas(a, b, n, m, c, k);
        System.out.println("Los estudiantes que perdieron ambas asignaturas son:");
        ob.printVector(c, k);

    }

}
