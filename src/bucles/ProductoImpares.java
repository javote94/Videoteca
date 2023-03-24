/*
Diseñar un programa que muetre el producto de los primeros diez números impares
*/
package bucles;

public class ProductoImpares {

    public static void main(String[] args) {
        
        int num = 0;
        long producto = 1;
        int impar = 0;
        
        do{
            if (num % 2 != 0){
                producto *= num;
                impar ++;
            }
            num ++;
        }while(impar < 10);
        
        System.out.println("El producto es: " + producto);
    }
}
