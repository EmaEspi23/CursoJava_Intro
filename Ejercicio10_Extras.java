/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta.
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
la función Math.random() de Java.
 */

import java.util.Random;
import java.util.Scanner;


public class Ejercicio10_Extras {

    
    public static void main(String[] args) {
       Scanner Leer=new Scanner(System.in);
       Random numAleatorio = new Random();
       int n1,n2,n3,resp;
       /*n1=(int)(Math.random()*10+1);
       n2=(int)(Math.random()*10+1);
       
*/
       Random numAleatorio1 = new Random();

       // Numero entero entre 25 y 75
       n1 = numAleatorio.nextInt(10);
       n2 = numAleatorio.nextInt(10);
             
       
        n3=n1*n2;
        System.out.println(n3);
       do{
           System.out.println("Ingrese una respuesta");
           resp=Leer.nextInt();
           if (resp!=n3){
               System.out.println("Siga Intentando!!");
           }else{
               System.out.println("Acerto!!");
           }
       }while(resp!=n3);
        

    }
    
}