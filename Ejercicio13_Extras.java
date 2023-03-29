/*
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura
de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 */

import java.util.Scanner;

public class Ejercicio13_Extras {




    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n,k=1;
        String numero="";
        n=Leer.nextInt();
        while(k<=n){
            numero=numero+String.valueOf(k);
            System.out.println(numero);
            k++;
        }
            
            
    }
    
}