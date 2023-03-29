/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */

import java.util.Scanner;

public class Ejercicio9_Teoria {

 public static void main(String[] args) {

    	Scanner entrada = new Scanner(System.in);

    	int num, suma = 0;


    	System.out.println("Capturando el 0");
        
        do {

    	System.out.print("Ingrese un Nro:");
    	num = entrada.nextInt();
            if (num<0) {
                suma = suma;
            } else
        suma += num;

            if (num == (0)){
          break;}
            
    	} while (true);
        System.out.println("Se capturo el Nro 0");
        System.out.println("La suma de los Nros Ingresados es : " + suma);
}
 
}