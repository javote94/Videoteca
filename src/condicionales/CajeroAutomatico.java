/*
Hacer un programa que simule un cajero automático con un saldo inicial de 1000
dólares, con el siguiente menú de opciones:

1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
*/

package condicionales;
import javax.swing.JOptionPane;

public class CajeroAutomatico {
    
    public static void main(String[] args) {
        
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldo_actual, retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su "
        + "Cajero Automático\n"
        + "1. Ingresar dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir"));
        
        switch (opcion){
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la "
                + "cantidad que desea ingresar a la cuenta:"));
                saldo_actual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldo_actual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la "
                + "cantidad que desea retirar de la cuenta"));
                if (retiro > saldo_inicial){
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo "
                    + "suficiente para este retiro");
                } 
                else{
                    saldo_actual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldo_actual);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Ha salido del sistema");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");        
        }
    }
}
