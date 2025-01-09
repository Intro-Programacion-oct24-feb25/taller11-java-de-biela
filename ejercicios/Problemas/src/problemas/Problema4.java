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
public class Problema4 {
static String nombre;
static String cedula;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.println("ingrese su nombre completo");

            nombre = entrada.nextLine();
            System.out.println("ingrese su numero de cedula");
            cedula = entrada.nextLine();
            System.out.println("ingrese 1 para calcular la planilla de luz o 2 para"
                    + " calcular el predio de un inmueble");
            int numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    obtenerluz();
                    break;
                case 2:
                    obtenerpredio();
                    break;
                default:
                    System.out.println("el numero no esta del rango");
                    break;
            }
            entrada.nextLine();
            System.out.println("Ingrese s para salir");
            String salida= entrada.nextLine();
            if(salida.equalsIgnoreCase("s")){
                bandera=false;
            }
            

        }

    }

    public static void obtenerluz() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del kilovatio");
        double valork = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos");
        double valorc = entrada.nextDouble();
        double valort = valork * valorc;
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de:"
                + "$%.2f\n", nombre, cedula, valort);

    }

    public static void obtenerpredio() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del inmueble");
        double valork = entrada.nextDouble();
        
        double valorpredio=valork*0.02;
       
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble valorado"
                + "en %.2f y tiene que pagar el depredio %.2f\n", nombre,cedula,
                valork, valorpredio);

    }

}
