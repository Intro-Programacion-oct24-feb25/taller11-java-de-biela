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
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = obtenerMediaAritmetica(informacion);
        double desviacionEstandar = obtenerDesviacionEstandar(informacion, media);
        System.out.printf("La media aritmética es: %.2f y el valor de la "
                + "desviación estándar es: %.4f\n", media, desviacionEstandar);

    }

    public static double obtenerMediaAritmetica(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma / arreglo.length;
    }

    public static double obtenerDesviacionEstandar(int[] arreglo, double media) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + Math.pow(arreglo[i] - media, 2);
        }
        return Math.sqrt(suma / (arreglo.length -1));
    }
}
