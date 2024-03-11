/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productoescalar;

/**
 *
 * @author sdariza
 */
public class ProductoEscalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int u[] = {-1, 5, 3, 5, 4, 7, 8, 8, 6, 7, 4};
        int n = v.length - 1; // Dimensión de los vectores v y u
        // vamos a suponer que las dimensiones son consistentes.
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + v[i] * u[i];
        }
        System.out.println("v * u = " + s);
    }

}
