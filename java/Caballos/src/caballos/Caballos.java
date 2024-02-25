/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caballos;

import java.util.Random;

/**
 *
 * @author USER
 */
public class Caballos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Definimos el tamaño de los vectores
        int numCaballos = 12;
        int numCarrerasPorCaballo = 20; // Por ejemplo, cada caballo participa en 5 carreras

        // Creamos los vectores para almacenar los datos de las carreras
        int[] caballos = new int[numCaballos * numCarrerasPorCaballo]; // Vector para los caballos
        double[] tiempos = new double[numCaballos * numCarrerasPorCaballo]; // Vector para los tiempos

        // Generamos datos aleatorios para las carreras
        Random random = new Random();
        for (int i = 0; i < numCaballos; i++) {
            for (int j = 0; j < numCarrerasPorCaballo; j++) {
                int index = i * numCarrerasPorCaballo + j; // Índice actual en los vectores
                caballos[index] = i + 1; // Número del caballo
                tiempos[index] = 9 + random.nextDouble() * 6; // Tiempo aleatorio entre 9 y 15 segundos
            }
        }

        // Imprimimos los datos de las carreras
        System.out.println("Carreras registradas:");
        for (int i = 0; i < caballos.length; i++) {
            System.out.println("Caballo " + caballos[i] + ", Tiempo: " + tiempos[i] + " segundos");
        }

        // Implementar los pseudos trabajados en clase.
        // Recordar que los índices en java van desde 0 hasta en n-1.
    }

}
