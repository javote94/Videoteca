//Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10

package condicionales;
import javax.swing.JOptionPane;

public class Multiplo {
    
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        
        if(numero % 10 == 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es múltiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "No es múltiplo de 10");
        }
    } 
}
