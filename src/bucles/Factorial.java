/*
Pedir un número y calcular su factorial:
N! = 1 * 2* 3 * ... * N
*/
package bucles;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        long factorial = 1;
        
        System.out.print("Ingresar número para calcular su factorial: ");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
