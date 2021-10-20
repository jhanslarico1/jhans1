import java.util.Scanner; 
public class Promedio{
static Scanner sc = new Scanner(System.in);
  static void calcularpromedioEAMQ(){
  Scanner in = new Scanner(System.in);
  double primer_examen, promedio, segundo_examen, tercer_examen;
  System.out.print("Ingresa el valor de primer examen: ");
  primer_examen = in.nextDouble();
  in.nextLine();
  System.out.print("Ingresa el valor de segundo examen: ");
  segundo_examen = in.nextDouble();
  in.nextLine();
  System.out.print("Ingresa el valor de tercer examen: ");
  tercer_examen = in.nextDouble();
  in.nextLine();
  promedio=primer_examen*0.25+segundo_examen*0.25+tercer_examen*0.5;
  System.out.println("Valor de promedio: " + promedio);
    }


 static void salarioyPuntosEAMQ(){
    // definir variables
    double puntos =0;
    String  bono ="";
    //datos de entrada
    System.out.println("Ingrese el puntaje que alcanzo");
    puntos=sc .nextDouble();  
    //proceso
    if (puntos>=100 && puntos<=200){
      bono="10% del salario minimo";
    }
   else if (puntos>=201 && puntos<=300){
      bono="40% del salario minimo";
    }
    else if(puntos>=301 && puntos<=400){
      bono="70% salario minimo";
      }
   else if(puntos>401){
     bono="80% salario minimo";
   }
   else{
      bono="No alcanzo bono";
   }
    //datos de salida
    System.out.println("Usted a ganado el siguiente bono :"+bono);
  }
    


  static void algoritmocavunaEAMQ(){ 
        Scanner in = new Scanner(System.in);
        //variables
        int edad, sexo;
        //datos de entrada
        System.out.print("Ingresa su edad actual: ");
        edad = in.nextInt();
        in.nextLine();
        System.out.println("Seleccione con 1 ó 2 su sexo.");
        System.out.println("\t1.- Femenino");
        System.out.println("\t2.- Masculino");
        System.out.print("\t: ");
        do {
            sexo = in.nextInt();
            in.nextLine();
            //proceso
            if (sexo<1||sexo>2)
                System.out.print("Valor incorrecto. Ingr\u00E9intente nuevamente.: ");
        } while (sexo<1||sexo>2);
        if((sexo==2&&edad>=16&&edad<70)||edad<16)
        //datos de salida
            System.out.println("Le corresponde la vacuina de tipo A");
        if(sexo==1&&edad>=16&&edad<70)
            System.out.println("Le corresponde la vacuina de tipo B");
        if(edad>70)
            System.out.println("Le corresponde la vacuina de tipo C");
    }
      
 
 static void operacionesEAMQ(){
        Scanner in = new Scanner(System.in);
        //definir variables
        double n1, n2, opcion, resultado;
        //datos de entrada
        System.out.print("Ingresa el primer valor: ");
        n1 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el segundo valor: ");
        n2 = in.nextDouble();
        in.nextLine();
        System.out.print(" Elija el numero de la operación que desea realizar:                     ");
        System.out.println ("\t1.-Sumar  ");
        System.out.println ("\t2.- Restar");
        System.out.println ("\t3.- Multiplicar");
        System.out.println ("\t4.- Dividir");
        System.out.println ("\t5.- Potencia");
        System.out.print ("\t: ");
        opcion = in.nextDouble();
        in.nextLine();
        resultado=0;
        //proceso
        if(opcion==1)
            resultado=n1+n2;
        if(opcion==2)
            resultado=n1-n2;
        if(opcion==3)
            resultado=n1*n2;
        if(opcion==4)
            resultado=n1/n2; 
         if(opcion==5)
            resultado=Math.pow ( n1 , n2 ) ;
        //datos de salida
        System.out.println("El resultado de su operación es: " + resultado);
        
    }
       

  static void opcionesdealgoritmosEAMQ(){
int opcion=0;
String msg="Eliga el algoritmo que desea probar\n 1=Calcular promedio Final \n 2=Calcular Salario Minimo \n 3=Identificar tipo de Vacuna \n 4=Calcular la Operación que desee";
System.out.println(msg);
opcion=sc.nextInt();

while(opcion!=0){
    switch(opcion){
        case 1: calcularpromedioEAMQ(); break;
        case 2: salarioyPuntosEAMQ(); break;
        case 3: algoritmocavunaEAMQ(); break;
        case 4: operacionesEAMQ(); break;
        default: System.out.println("Opcion no existe!");
    }
  System.out.println(msg);
  opcion=sc.nextInt();    
}
}

 public static void main(String[] arg){
 opcionesdealgoritmosEAMQ();

}

}