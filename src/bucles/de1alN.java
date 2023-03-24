/*
Pedir un número N, y mostrar todos los números del 1 al N
*/

package bucles;
import java.util.Scanner;

public class de1alN {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar un número: ");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
