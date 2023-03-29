/*
Implementar un programa que le pida dos números enteros al usuario
y determine si ambos o alguno de ellos es mayor a 25.
 */

import java.util.Scanner;

public class Ejercicio6_Teoria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num_uno = 0, num_dos = 0;

        System.out.println("Mayor de 25");

        System.out.println("Ingresa el Número 1: ");
        num_uno = entrada.nextInt();

        System.out.println("Ingresa el Número 2: ");
        num_dos = entrada.nextInt();

        if (num_uno > 25 || num_dos > 25) {

            if (num_uno > 25) {

                System.out.println("El primer Nro es mayor a 25.");
            }

            if (num_dos > 25) {

                System.out.println("El segundo Nro es mayor a 25.");
            }

            if (num_uno > 25 && num_dos > 25) {

                System.out.println("Ambos Nros son mayores a 25.");
            }

        } else {
            System.out.println("Ningun Nro es mayor a 25");
        }
    }

}
