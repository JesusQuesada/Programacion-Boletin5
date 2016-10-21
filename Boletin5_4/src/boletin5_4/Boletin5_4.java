
package boletin5_4;

import javax.swing.JOptionPane;

public class Boletin5_4 {

    public static void main(String[] args) {
        Clase5_4 obj = new Clase5_4();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número 1 "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número 2 "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número 3 "));
        obj.compararNumeros(n1, n2, n3);
                
    }
    
}
    

