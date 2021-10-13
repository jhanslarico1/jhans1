import java.util.Scanner;

public class EstCondicional {
    public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	int num1,num2;
    	System.out.print("Ingrese primer valor:");
    	num1=In.nextDouble();
    	System.out.print("Ingrese segundo valor:");
    	num2=In.nextDouble();
    	if (num1>num2) {
    		System.out.print(num1);
    	} else {
    		System.out.print(num2);
    	}
    }
}