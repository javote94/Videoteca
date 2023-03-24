
//Hacer un programa que tome dos números y diga si ambos son pares o impares

package condicionales;

import javax.swing.JOptionPane;


public class ParImpar {
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
        
        if((num1 % 2 == 0) && (num2 % 2 == 0)){
            JOptionPane.showMessageDialog(null,"Ambos números son pares");
        }else if((num1 % 2 != 0) && (num2 % 2 != 0)){
            JOptionPane.showMessageDialog(null,"Ambos números son impares");
        }else{
            JOptionPane.showMessageDialog(null,"Un número es par y el otro impar");
        }
        
    }
}
