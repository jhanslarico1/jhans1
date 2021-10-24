import java.util.Scanner; 
public class tarea6 {

static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
    //Definir variables
    int n=1,nota;
    String nombre;
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String blanco = "\033[37m";
    //Datos de entrada
    System.out.println("\tCONDICION DE ESTUDIANTE");
    do {
      System.out.print("Ingrese el nombre:  ");
      nombre=sc.nextLine();
      System.out.print("Ingrese la nota:  ");
      nota = sc.nextInt();
      
      if (nota>13) {
        System.out.println("\t"+ verde +nombre+ "  Aprobado");
      }
      else{
        System.out.println("\t"+ rojo +nombre+"   Reprobado");
      }
      System.out.print(blanco+"Desea continuar (1 = si)(# = No): ");
      n = sc.nextInt();
      sc.nextLine();
    }while (n==1);

  }
  
}