
package boletin5_2;

import javax.swing.JOptionPane;

public class Boletin5_2 {

    public static void main(String[] args) {
        Clase5_2 obj = new Clase5_2();
        short n1 = Short.parseShort(JOptionPane.showInputDialog("Introducir número 1 "));
        short n2 = Short.parseShort(JOptionPane.showInputDialog("Introducir número 2 "));
        obj.sumarRestar(n1, n2);
                
    }
    
}
