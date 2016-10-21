
package boletin5_4;

public class Clase5_4 {
    //atributos
    int num1, num2;
    //métodos
    public void compararPeso(int n1, int n2){
        if (n1>n2)
            System.out.println("La diferencia es " +(n1-n2));
        else if (n2>n1)
            System.out.println("La diferencia es " +(n2-n1));
        else
            System.out.println("No hay diferencia");
            
    }
}
