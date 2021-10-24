import java.util.Scanner; 

public class cantidades {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int n,numero,a=0,b=0,c=0;
  
    //Datos de entrada
    System.out.println("Programa que determina numeros menores,mayores e iguales a cero");
    System.out.println("Ingresa la cantidad de numeros a ejecutar:");
    n=sc.nextInt();
    
    //Proceso
    for(int i = 0;i < n;i++){

      System.out.println("ingresa el numero");
      numero=sc.nextInt();
      if(numero>0){
        a=a+1;
      }
      else if(numero<0){
        b=b+1;
      }
      else {
        c=c+1;

      }
    }
    //Datos de salida
   System.out.println("numeros  mayores a 0 :"+a+"\nnumeros menores a 0 :"+b+"\nnumeros iguales a 0 :"+c);
  
        
  }
    
}