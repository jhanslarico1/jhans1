import java.util.Scanner; 

public class tarea7 {

static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    
    //Definir variables
    int n;

    //Datos de entrada
    System.out.println("Ingrese un numero entero positivo");
    n=sc.nextInt();
    
    //Proceso
    if (n>0){

        int resultado = (int)(Math.pow(n, 3));
          
          //Datos de Salida
          
          System.out.println("el cubo del numero  "+n+"  es:  "+resultado);
        }
    else{
      System.out.println("el numero ingresado no es correcto");
    }
    }
    
    

}