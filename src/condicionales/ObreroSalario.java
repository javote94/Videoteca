/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
_Si trabaja 40 horas o menos se le paga $16 por hora.
_Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y
$20 por cada hora extra
*/


package condicionales;

import javax.swing.JOptionPane;


public class ObreroSalario {
    
    public static void main(String[] args) {
        
        int horasTrabajo, salarioSemanal;
        
        horasTrabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas:"));
        
        if(horasTrabajo <= 40){
            salarioSemanal = horasTrabajo * 16;
        }else{
            salarioSemanal = (40 * 16) + ((horasTrabajo - 40) * 20);
        }
        
        JOptionPane.showMessageDialog(null, "El salario semanal es: " + salarioSemanal);
    }
}
