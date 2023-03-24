/*
Realizar un juego para adivinar un número. Para ellos generar un número aleatorio
entre 0 y 100, y luego ir pidiendo números indicando "es mayor" o "es menor" según
sea el caso con respecto a N. El proceso termina cuando el usuario acierta y
mostrar la cantidad de intentos.
*/

package bucles;
import java.util.Scanner;


public class NumAleatorio {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int aleatorio, num, intentos = 0;
        
        aleatorio = (int) (Math.random() * 100);
        
        System.out.println("Acierte el número aleatorio\n"+"---------------------------");
        System.out.println("Aleatorio: " + aleatorio);
        
        do{
            System.out.print("Ingresar número: ");
            num = leer.nextInt();

            if (num > aleatorio) {
                System.out.println("Digite un número menor");
            } else if (num < aleatorio){
                System.out.println("Digite un número mayor");
            }

            intentos++;
        
        }while(num != aleatorio);
        
        System.out.println("ADIVINASTE EL NÚMERO EN "+intentos+" INTENTOS");
    }
}
