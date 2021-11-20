import java.util.Scanner;
 
public class tablaMultiplicar
{
    public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;
 
        System.out.print("indica la tabla de multiplicar: ");
        numero = obtenerNumero.nextInt();
 
        for(i = 1; i<=numero; i++)
        {
            for(j = 1; j <= 20; j++)
            {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}