/*
Contruir un programa que simule el funcionamiento de una calculadora que puede
realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y
división) con valores numéricos enteros.
El usuario debe especificar la operación con el primer caracter del primer 
parámetro de la línea de comandos: S o s para la suma; R o r para la resta;
P, p, M o m para el producto y D o d para la división.
*/

package condicionales;

import javax.swing.JOptionPane;

public class Calculadora {
    
    public static void main(String[] args) {
     
        int num1, num2, suma, resta, producto;
        double division;
        char opcion;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar otro número:"));
        
        opcion = JOptionPane.showInputDialog("Ingresar la operación deseada: ").charAt(0);
        
        switch(opcion){
            case 's':
            case 'S':
                suma = num1 + num2;
                JOptionPane.showMessageDialog(null,"La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                resta = num1 - num2;
                JOptionPane.showMessageDialog(null,"La resta es: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                producto = num1 * num2;
                JOptionPane.showMessageDialog(null,"La multiplicacion es: " + producto);
                break;
            case 'd':
            case 'D':
                division = (double) num1 / num2;
                JOptionPane.showMessageDialog(null,"La division es: " + division);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion incorrecta");
        }
    }
}
