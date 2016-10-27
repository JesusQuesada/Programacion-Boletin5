
package boletin5_2;

public class Clase5_2 {
    //atributos
    short num1, num2;
    //métodos
    public void sumarRestar(short n1, short n2){
        if (n1 > n2)
            System.out.println(n1-n2);
        else if (n1 < n2)
            System.out.println(n1+n2);
        else
            System.out.println(n1-n2);
            
    }
}
