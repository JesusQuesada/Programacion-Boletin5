
package boletin5_6;

import javax.swing.JOptionPane;

public class Boletin5_6 {

    public static void main(String[] args) {
        Clase5_6 obj = new Clase5_6();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número 1 "));
        obj.tipoVentas(n1);
                
    }
    
}