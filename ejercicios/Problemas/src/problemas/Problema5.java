/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {

        int[][] valores1 = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 200, 300}
        };

        int[][] valores2 = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 200, 300}
        };

        int[][] suma = sumarValores(valores1, valores2);

        System.out.println("Resultado de los dos arreglos:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumarValores(int[][] matriz1, int[][] matriz2) {

        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
}
