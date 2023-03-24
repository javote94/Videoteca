/*
Pedir números hasta que se ingrese uno negativo, y mostrar cuántos números
se han introducido.
*/
package bucles;
import java.util.Scanner;


public class NumContador {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, contador = 0;
        
        System.out.print("Ingresar número: ");
        num = leer.nextInt();
        
        while(num >= 0){
            contador++;
            
            System.out.print("Ingresar otro número: ");
            num = leer.nextInt();
        }
        System.out.println("Cantidad de valores no negativos ingresados al sistema: " + contador);
    }
}
