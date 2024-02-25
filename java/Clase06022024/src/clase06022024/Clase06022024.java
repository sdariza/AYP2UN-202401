/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase06022024;

import java.util.Scanner;


/**
 *
 * @author sdariza
 */
public class Clase06022024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cómo hacer print
        System.out.println("Hola mundo"); // "este el el print de python"
        System.out.print("Soy el segundo print sin el ln");
        System.out.println("");
        System.out.print("Soy el tercer print sin el ln");
        
        // print con formato
        System.out.println("");
        System.out.printf("Hoy es %d de febrero del %d",6,2024);
        System.out.println("Hoy es "+6+" de febrero");
        System.out.printf("\n%f",5.5);
       
        
        int i = 0, j=10;
        i = i + 10;
        j = i + 20;
        System.out.printf("\nEl valor de la variable i es: %d, y el valor de j es: %d\n",i,j);
        
        //Ciclo para en java
        for(int k = 0; k<10; k++){
            if (k % 2 == 0)
                    System.out.printf("\nEl número %d es par\n",k);
        }
        
        // Leer datos de consola
        Scanner input = new Scanner(System.in);
        
        int codEst;
        System.out.println("Ingrese el codigo del estudiante: ");
        codEst = input.nextInt();
        
        // codEst = int(input())
        input.close();
        
    }
    
}
