/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
introduzca un número negativo.
*/

package bucles;
import java.util.Scanner;

public class producto {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, cuadrado;
        
        System.out.print("Ingresar número: ");
        num = leer.nextInt();
        
        while(num >= 0){
            cuadrado = (int) Math.pow(num, 2);
            System.out.println("El numero "+num+" elevado al cuadrado es: "+cuadrado);
            
            System.out.print("Ingresar otro número: ");
            num = leer.nextInt();
        }
        
        System.out.println("Ha salido del programa!");
    }
}
