
package boletin5_4;

import javax.swing.JOptionPane;

public class Boletin5_4 {

    public static void main(String[] args) {
        Clase5_4 obj = new Clase5_4();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir peso de J. "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introducir peso de D. "));
        obj.compararPeso(n1, n2);
                
    }
    
}
    

