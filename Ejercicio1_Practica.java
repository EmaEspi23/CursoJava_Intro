/*
Crear un programa que dado un número determine si es par o impar.
 */

import java.util.Scanner;

public class Ejercicio1_Practica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un Nro:");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El Nro ingresado es PAR");
        } else {
            System.out.println("El Nro ingresado es IMPAR");

        }
    }
}