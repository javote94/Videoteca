/*
Pedir números hasta que se teclee un cero, mostrar la suma de todos los
números introducidos
*/

package bucles;
import java.util.Scanner;

public class Sumatoria {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, suma = 0;
        
        do{
            System.out.print("Ingresar número: ");
            num = leer.nextInt();
            
            suma += num;
            
        }while(num != 0);
        
        System.out.println("La suma de todos los números introducidos es: "+suma);
    }
}
