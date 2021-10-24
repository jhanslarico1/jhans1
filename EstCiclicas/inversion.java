import java.util.Scanner; 

public class inversion {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int n=12,a,ahorro,total=0;
  
    //Datos de entrada
    System.out.println("\tPrograma que determina la inversion final");
    System.out.println("Ingrese los anhos de ahorro");
    a=sc.nextInt();
    a=(a*n);
    for(int i = 1;i <=a;i++){
    System.out.println("Ingrese el ahorro del mes."+i);
    System.out.print("\t: ");
    ahorro=sc.nextInt();

      if(ahorro>0){
      total+=ahorro;
      }
      else {
      System.out.println("Ingrese un numero valido");
      }
    }
    System.out.println("la inversion final es:\n"+(total+(total*0.1)));
    
  
  }
}