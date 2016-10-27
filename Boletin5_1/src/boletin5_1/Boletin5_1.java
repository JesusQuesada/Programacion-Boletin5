
package boletin5_1;

import javax.swing.JOptionPane;

public class Boletin5_1 {

    public static void main(String[] args) {
       Clase5_1 obj = new Clase5_1();
       int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir número "));         
       obj.condicional(n1);
    }
    
}
