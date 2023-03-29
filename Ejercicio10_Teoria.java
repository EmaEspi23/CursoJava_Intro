/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

import java.util.Scanner;

public class Ejercicio10_Teoria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, j, i;

        for (i = 0; i < 4; i++) {
            System.out.println("Ingrese 4 Nros entre 1 y 20:");
            num = leer.nextInt();

            if (num < 1 || num > 20) {
                do {
                    System.out.println("El Nro es incorrecto, Ingrese otro Nro:");
                    num = leer.nextInt();
                } while (num < 1 || num > 20);
            }
            System.out.print(num);
            for (j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
