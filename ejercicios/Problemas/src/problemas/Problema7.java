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
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades = generarArreglo();
        imprimirValores(ciudades);
    }

    public static String[] generarArreglo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos del arreglo: ");
        int numElementos = scanner.nextInt();
        scanner.nextLine();

        String[] arreglo = new String[numElementos];
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingrese una ciudad de Ecuador: ");
            arreglo[i] = scanner.nextLine();
        }
        return arreglo;
    
}
    public static void imprimirValores(String[] arreglo) {
        System.out.println("Ciudades con 4 o 5 caracteres:");
        for (String ciudad : arreglo) {
            if (ciudad.length() == 4 || ciudad.length() == 5) {
                System.out.println(ciudad);
            }
        }
    }

    
}
