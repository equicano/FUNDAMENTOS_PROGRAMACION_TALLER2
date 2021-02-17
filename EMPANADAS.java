import java.util.Scanner;

public class EMPANADAS
{
  public static void main(String[] args)
  {
      int semanas_restantes;
      int numero_empanadas;
      int numero_arepas;
      double precio_empanada;
      double precio_arepa;
      double ganancias_semana;
      double ganancias_semanas_restantes;
      
      Scanner teclado= new Scanner(System.in);
        
        System.out.print("¿Cuántas semanas restantes quedan de trabajo?");
        semanas_restantes = teclado.nextInt();
    
        System.out.print("¿Cuál es la cantidad de empanadas vendidas en un día?");
        numero_empanadas = teclado.nextInt();
        
        System.out.print("¿Cuál es la cantidad de arepas vendidas en un día?");
        numero_arepas = teclado.nextInt();
        
        System.out.print("¿Cuál es el precio de cada empanada?");
        precio_empanada = teclado.nextDouble();
        
        System.out.print("¿Cuál es el precio de cada arepa?");
        precio_arepa = teclado.nextDouble();

      ganancias_semana = ( (numero_empanadas * precio_empanada * 5) + ( numero_arepas *  precio_arepa * 2 ) );
      
      ganancias_semanas_restantes = ( ganancias_semana * semanas_restantes );
      
      System.out.println("Las ganacias de una semana serán "  +  ganancias_semana + " pesos");
        System.out.println("Las ganacias de las semanas restantes serán "  +  ganancias_semanas_restantes + " pesos");
            
      
      
      
    }
}
