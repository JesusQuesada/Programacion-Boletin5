
package boletin5_5;

public class Clase5_5 {
    //atributos
    int num1, num2, num3;
    //métodos
    public void compararNumeros(int n1, int n2, int n3){
        if (n1>n2&&n1>n3)
            System.out.println("El número 1 es mayor");
        else if (n2>n1&&n2>n3)
            System.out.println("El número 2 es mayor");
        else
            System.out.println("El número 3 es mayor");
            
    }
}
