import java.util.Scanner;

public class HOSPITAL
{
    public static void main(String[] args) 
    {
        String enfermedad1="";
        int costo_enfermedad;
        int edad;
        int dias;
        int costo_neto;
        double descuento;
        double costo_descuento;
     
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("¿Cuál es la enfermedad a tratar?");
        enfermedad1 = teclado.nextLine();

        System.out.print("¿Cuál es la edad del paciente?");
        edad = teclado.nextInt();
        
        System.out.print("¿Cuántos días estuvo el paciente?");
        dias = teclado.nextInt();
        
        
        if (enfermedad1.equals("Coronavirus") || enfermedad1.equals("coronavirus")) {
                    
            costo_enfermedad = 35000;
                    
	        } else if  (enfermedad1.equals("Gripa") || enfermedad1.equals("gripa")) {
	            
        	        costo_enfermedad = 12100;
        	           
	        } else if   (enfermedad1.equals("Fractura") || enfermedad1.equals("fractura")) {
	            
	           	costo_enfermedad = 21000;
	           
                }	else if (enfermedad1.equals("Intoxicación") || enfermedad1.equals("intoxicación") || enfermedad1.equals("Intoxicacion") || enfermedad1.equals("intoxicacion")) {
                    
	           	costo_enfermedad = 17500;   	
	           	
	        }	else{
	            
	           	costo_enfermedad = 250000;  
	           	
	        }  	
	           	
        costo_neto = costo_enfermedad * dias;
        
        if (edad >= 14 && edad <= 22) {
            
                	descuento = 0.1;
                
            }else { 
                
                descuento = 0;
                
            }
            
	        
        
        costo_descuento = costo_neto - ( costo_neto * descuento );
               
               

        System.out.println("El costo por día es de "  +  costo_enfermedad + " pesos");
        System.out.println("El costo neto es de "  +  costo_neto + " pesos");
        System.out.println(("El descuento es de "  + ( costo_neto*descuento ) + " pesos"));
        System.out.println(( "El costo total es  es de "  +  costo_descuento + " pesos"));
    } 
}
