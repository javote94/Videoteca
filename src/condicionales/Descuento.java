/*
En un shopping se hace un 20% de descuento a los clientes cuya compra supere
los $300. ¿Cuál será la cantidad que pagará una persona por su compra?
*/

package condicionales;

import javax.swing.JOptionPane;


public class Descuento {
    
    public static void main(String[] args) {
        
        float compra, descuento;
        
        compra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de compra: "));
        
        if(compra > 300){
            descuento = compra * 0.20f;
            compra -= descuento;
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + compra);
        }else{
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + compra);
        }
    }
}
