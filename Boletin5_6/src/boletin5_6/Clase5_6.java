
package boletin5_6;

public class Clase5_6 {
    //atributos
    int num1;
    //métodos
    public void tipoVentas(int n1){
        if (n1>1000)
            System.out.println("Primera necesidad");
        else if (n1>500&&n1<=1000)
            System.out.println("Consumo Alto");
        else if (n1>100&&n1<=500)
            System.out.println("Consumo Medio");
        else if (n1<=100)
            System.out.println("Consumo Bajo");
            
    }
}