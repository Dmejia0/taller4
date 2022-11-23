
package javaapplication1;
import java.util.Scanner;
public class Ejercicio16 {

    /**
     * Dada las horas trabajadas por un empleado determinar cuántogana 
     * semanalmente y mensualmente, si el trabajador debe trabajar
     * mínimo 38h semanales y un máximo de 56h.  Se debe pedir la cantidad de
     * horas trabajadas y verificar que esté dentro del rango permitido, también
     * se debe pedir el precio de la hora.  Imprimir la cantidad de horas 
     * trabajadas y el pago.
     */
    
    /**
     * Datos de entrada:Horas trabajadas
     * Datos de salida:Cantidad de horas trabajadas y el pago
     * @param args 
     */
    public static void main(String[] args){
      
        double cantHoras;
        double pago;
        double valHora = 0;
        
        Scanner read= new Scanner(System.in);
        System.out.println("Escribe la cantidad de horas trabajadas"); 
        cantHoras= read.nextDouble();
        
        while(cantHoras<38 || cantHoras>56){
         System.out.println("Escriba cantidad valida de horas"); 
        cantHoras= read.nextDouble();   
    }
        
        System.out.println("Las horas trabajadas"+ cantHoras);
        System.out.println("Las horas trabajadas en el mes"+ cantHoras*4*valHora);
        
        System.out.println("El salario semanal es igual"+ cantHoras*valHora);
        
        
     
                
    }

   
    }
 
