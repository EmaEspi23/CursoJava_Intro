/*
Realizar un programa que solo permita introducir solo frases
o palabras de 8 de largo. Si el usuario ingresa una frase o
palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */

import java.util.Scanner;

public class Ejercicio3_Practica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Palabra de 8 Letras");
        System.out.println("Ingrese una palabra:");
                String Frase = leer.nextLine();
                
        if (Frase.length() == 8) {
            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }
    }

}
