import java.util.Scanner; 

public class colores {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int n,color,verde=0,blanco=0,rojo=0;
  
    //Datos de entrada
    System.out.println("Programa que determina el color de focos");
    System.out.println("Ingrese la cantidad de focos");
    n=sc.nextInt();
    for(int i = 0;i < n;i++){

    System.out.println("Selecciona el color.");
    System.out.println("\t1.- verde");
    System.out.println("\t2.- blanco");
    System.out.println("\t3.- rojo");
    System.out.print("\t: ");
    do {
      color = sc.nextInt();
      sc.nextLine();
      if (color<1||color>3)
      System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
    } while (color<1||color>3);
    
    if(color==1){verde+=1;}
    else if(color==2){blanco+=1;}
    else {rojo+=1;} 
    }
    
    System.out.println("El total de focos verdes es :"+verde+"\nEl total de focos blancos es :"+blanco+"\nEl total de focos rojos es :"+rojo);    
  }
    
}