/*
Leer números hasta que se introduzca un cero. Para cada número ingresado 
indicar si es par o impar.
*/

package bucles;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar número: ");
        int num = leer.nextInt();
        
        while(num != 0){
            if(num % 2 == 0){
                System.out.println("El número es par");
            }else{
                System.out.println("El número es impar");
            }
            
            System.out.print("Ingresar otro número: ");
            num = leer.nextInt();
        }
        
        System.out.println("Ha salido del programa!");
    }
}
