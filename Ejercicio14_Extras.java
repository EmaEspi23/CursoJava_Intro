/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos
de todas las familias.

 */

import java.util.Scanner;


public class Ejercicio14_Extras {

    
    public static void main(String[] args) {
        Scanner Leer= new Scanner(System.in);
        int n,m,cont=0;
        float promedio=0;
        System.out.println("Ingrese la cantidad de familias:");
        n=Leer.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Ingrese cantidad de hijos de la familia "+(i+1));
            m=Leer.nextInt();
            for(int y=0;y<m;y++){
                int edad;
                System.out.println("Ingrese edad: ");
                edad=Leer.nextInt();
                promedio+=edad;
                cont++;
            }
        }
        System.out.println("Promedio de edades: "+promedio/cont);
    }
    
}