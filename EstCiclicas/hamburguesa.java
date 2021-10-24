import java.util.Scanner; 
public class hamburguesa {
static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int h,th,fp,S=20,D=25,T=28,total=0;
    double resultado;
    //Datos de entrada

    System.out.println("Ingrese la cantidad  de hamburguesas:");
    h=sc.nextInt();

    for(int i = 0;i < h;i++){
    
      System.out.println("Selecciona el tipo de hamburguesas que desea.");
      System.out.println("\t1.- sensilla");
      System.out.println("\t2.- doble");
      System.out.println("\t3.- triple");
      System.out.print("\t: ");
        do {
        th = sc.nextInt();
        sc.nextLine();
        if (th<1||th>3)
        System.out.print("Valor incorrecto. Ingrese nuevamente.: ");
        }while (th<1||th>3);

      if(th==1){total=total+=S;}
      else if(th==2){total+=D;}
      else{total+=T;}
      
    }
    

    System.out.println("Ingrese el tipo de pago:");
    System.out.println("\t1.- Tarjeta");
    System.out.println("\t2.- Efectivo");
    System.out.print("\t: ");
      do {
      fp = sc.nextInt();
      sc.nextLine();
      if (fp<1||fp>3)
      System.out.print("Valor incorrecto. Ingrese nuevamente.: ");
      }while (fp<1||fp>3);
    if(fp==1){
      resultado=total+(total*0.05);
      System.out.print("El total a pagar es $ : "+resultado+"\nSe aplico un cargo del 5%\nGRASIAS POR SU COMPRA\n");
    }
    else {
      System.out.print("El total a pagar es $ : "+total+"\nGRASIAS POR SU COMPRA\n");
    }
  
  

  }

        
}
    