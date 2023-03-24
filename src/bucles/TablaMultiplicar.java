/*
Pide un número (entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
 */

package bucles;
import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        
        do {

            System.out.print("Ingresar número entre 0 y 10: ");
            num = leer.nextInt();

        } while (num < 0 || num > 10);
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        
    }
}
