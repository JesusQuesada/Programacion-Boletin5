
package boletin5_5;

import javax.swing.JOptionPane;

public class Boletin5_5 {

    public static void main(String[] args) {
        Clase5_5 obj = new Clase5_5();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número 1 "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número 2 "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número 3 "));
        obj.compararNumeros(n1, n2, n3);
                
    }
    
}