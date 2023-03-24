/*
Construir un programa que, dado un numero total de horas, devuelve el numero
de semanas, dias y horas equivalentes. Por ejemplo, dado un total de 1.000 horas
debe mostrar 5 semanas, 6 dias y 16 horas.
*/
package condicionales;

import java.util.Scanner;

public class DiasMesAño {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int horasTotal, semanas, dias, horas;
        
        System.out.print("Ingresar cantidad total de horas: ");
        horasTotal = leer.nextInt();
        
        semanas = horasTotal / 168;
        dias = (horasTotal % 168) / 24;
        horas = horasTotal % 24;
        
        System.out.println("El equivalentes es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        
    } 
}
