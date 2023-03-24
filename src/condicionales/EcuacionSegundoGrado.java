/*
Construir un programa que calcule y muestre por pantalla las raíces de la
ecuación de segundo grado de coeficientes reales:
ax^2 + bx + c = 0
*/
package condicionales;

import java.util.Scanner;


public class EcuacionSegundoGrado {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double a, b, c, raiz1, raiz2;
        
        System.out.print("Digite el valor de a: ");
        a = leer.nextDouble();
        System.out.print("Digite el valor de b: ");
        b = leer.nextDouble();
        System.out.print("Digite el valor de c: ");
        c = leer.nextDouble();
        
        raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        raiz2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        
        System.out.println("La raíz 1 es: " + raiz1);
        System.out.println("La raíz 2 es: " + raiz2);
        
    }
}
