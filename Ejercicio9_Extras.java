/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado
menor que el divisor, este resultado es el residuo, y el número de restas
realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

import java.util.Scanner;


public class Ejercicio9_Extras {

  
    public static void main(String[] args) {
       Scanner Leer =new Scanner(System.in);
       int n,n2,cont=0;
        System.out.println("Ingrese valor del dividendo:");
        n=Leer.nextInt();
        System.out.println("Ingrese valor del divisor:");
        n2=Leer.nextInt();
        while(n>=n2){
            n=n-n2;
            System.out.println("El valor es: "+n);
            cont++;
        }
        System.out.println("Cantidad de veces que se realizo division es: "+cont);
        System.out.println("El resto es:"+n);
    }
}