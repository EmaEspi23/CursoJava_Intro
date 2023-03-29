/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *

*/



import java.util.Scanner;

class Ejercicio8_Practica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un Nro :");
        num = entrada.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i>0 && i < num && j > 0 && j < num ){
                    System.out.println(" ");
                }
                else System.out.println(" * ");
            }
            System.out.println("");
        }
    }
    }
