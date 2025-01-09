/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("ingrese la nota 1");
        n1 = entrada.nextInt();
        System.out.println("ingrese la nota 2");
        n2 = entrada.nextInt();
        System.out.println("ingrese la nota 3");
        n3 = entrada.nextInt();
        System.out.println("ingrese la nota 4");
        n4 = entrada.nextInt();

        String tiponota = cualitativo(n1, n2, n3, n4);
        String salida = "el promedio de las notas: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " es: " + tiponota;
        salida = String.format("%s", mensaje(salida));
        System.out.println(salida);
    }

    public static String cualitativo(int a, int b, int c, int d) {
        int promedio = (a + b + c + d) / 4;
        String tipo = "";
        if (promedio >= 0 && promedio <= 5) {
            tipo = "Regular";
        } else {
            if (promedio > 5.1 && promedio <= 8) {
                tipo = "Bueno";
            } else {
                if (promedio > 8.1 && promedio <= 9) {
                    tipo = "Muy bueno";
                } else {
                    if (promedio > 9.1 && promedio <= 10) {
                        tipo = "Sobresaliente";
                    }

                }
            }
        }
        return tipo;
    }

    public static String mensaje(String a) {
        String mayuscula = a.toUpperCase();
        return mayuscula;
    }
}
