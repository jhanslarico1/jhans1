import java.util.Scanner;
public class suma_2_numeros {
    public static void main(String[] args) {

    double num1,num2,resultado;
        Scanner in = new Scanner(System.in);      
        System.out.print("Inserta el numero 1");
        num1 = in.nextDouble();
        
        System.out.println("Inserta el numero 2");
        num2 = in.nextDouble();
        resultado=num1+num2;
        System.out.println("el resultado es"+resultado);
    }
}
