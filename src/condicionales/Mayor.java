//Pedir dos numeros y decir cual es el mayor o si son iguales

package condicionales;
import javax.swing.JOptionPane;

public class Mayor {
    
    public static void main(String[] args) {
    
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null,"El número mayor es: "+num1);
        }else if(num2 > num1){
            JOptionPane.showMessageDialog(null,"El número mayor es: "+num2);
        }else{
            JOptionPane.showMessageDialog(null,"Ambos números son iguales");
        }
    }
}
