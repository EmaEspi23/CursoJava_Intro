/*
Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
oSi el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
oSi el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
oSi el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
oSi el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
oSi no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
 */

import java.util.Scanner;

public class Ejercicio7_Teoria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int motor = 0;

        System.out.println("Menu de Opciones");
        System.out.println("1: Bomba de Agua");
        System.out.println("2: Bomba de Gasolina");
        System.out.println("3: Bomba de Hormigón");
        System.out.println("4: Bomba de Pasta Alimenticia");
        System.out.println("Elija una Opcion: ");
        motor = entrada.nextInt();

        switch (motor) {

            case 1:
                System.out.println("La Bomba es una bomba es una bomba de Agua");
                break;

            case 2:
                System.out.println("La Bomba es una bomba Gasolina");
                break;

            case 3:
                System.out.println("La Bomba es una bomba de Hormigón");
                break;

            case 4:
                System.out.println("La Bomba es una bomba de Pasta Alimenticia");
                break;

            default:
                System.out.println("El valor ingresado no esta en las opciones");
                break;
        }
    }
}
