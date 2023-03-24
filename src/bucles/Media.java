
//Pedir números hasta que se introduzca uno negativo, y calcular la media

package bucles;
import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, suma = 0, elementos = 0;
        float promedio;
        
        System.out.print("Ingresar número: ");
        num = leer.nextInt();
        
        while (num >= 0){
           elementos ++;
           suma += num;
           
           System.out.print("Ingresar otro número: ");
           num = leer.nextInt();
        }
        
        if(elementos == 0){
            System.out.println("Error. No se puede dividir entre cero");
        }else{
            promedio = (float) suma / elementos;
            System.out.println("La media es " + promedio);
        }
    }
}
