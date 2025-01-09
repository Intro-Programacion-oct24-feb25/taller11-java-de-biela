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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int figura;
        System.out.println("ingrese ingres (1)si desea caluclar el areal del"
                + " cuadrado (2) si desea calcular el area de un triangulo"
                + "(3)si desa calcular el area de un rectangulo");
        figura = entrada.nextInt();
        switch (figura) {
            case 1:
                obtenercuadrado();
                break;

            case 2:

                obtenertriangulo();
                break;

            case 3:
                obtenerrectangulo();
                break;
            default:
                System.out.println("los numeros ingresados no estan en el rango");

        }
    }

    public static void obtenercuadrado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el lado del cuadrado");
        int lado = entrada.nextInt();
        int solucion = lado * lado;
        System.out.printf("el area del cuadrado con lados %d es %d",
                lado, solucion);
    }

    public static void obtenertriangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la base del triangulo");
        int base = entrada.nextInt();
        System.out.println("ingrese la altura del triangulo");
        int altura = entrada.nextInt();
        double solucion = (base * altura) / 2;
        System.out.printf("el area del triangulo con base %d y altura %d es "
                + "%.2f", base, altura, solucion);

    }

    public static void obtenerrectangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo");
        int base = entrada.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        int altura = entrada.nextInt();
        int solucion = (base * altura);
        System.out.printf("el area del rectangulo con base %d y altura %d es "
                + "%d", base, altura, solucion);

    }

}
