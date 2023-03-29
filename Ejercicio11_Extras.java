
import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo
entero truncan los números o resultados.
 */

public class Ejercicio11_Extras {

    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a contar digitos");
        int n,cont=1;
        n=Leer.nextInt();
        while(n>9){
            n=n/10;
            cont++;
        }
        System.out.println("El numero tiene "+cont+" digitos");
    }
    
}