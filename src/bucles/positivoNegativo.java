/*
Leer un número e indicar si es positivo o negativo. El proceso se repetirá 
hasta que se introduza un cero.
*/
package bucles;
import java.util.Scanner;

public class positivoNegativo {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresar número: ");
        num = leer.nextInt();
        
        while(num != 0){
        
            if(num > 0){
                System.out.println("Es positivo");
            }else{
                System.out.println("Es negativo");
            }
            System.out.print("Ingresar otro número: ");
            num = leer.nextInt(); 
        }
        System.out.println("Ha salido del programa");
    }
}
