/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el limite inicial.
 */

import java.util.Scanner;

public class Ejercicio5_Practica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numlimit, num, suma;
        suma = 0;
       

        System.out.println("Ingrese un Nro límite:");
        numlimit = leer.nextInt();

        do {

            System.out.println("Ingrese un Nro:");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            }

        } while (suma <= numlimit);

        System.out.println("La suma superó el número límite");

    }

}
