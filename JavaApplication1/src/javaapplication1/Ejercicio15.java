
package javaapplication1;
import java.util.Scanner;
public class Ejercicio15 {

    /**
     * Realizar un programa que calcule el valor a pagar por algunos galones 
     * de gasolina si sabemos que cada litro de gasolina vale 9.500.Imprimir la
     * cantidad de galones,precio por galón,cantidad de litros y precio a pagar.
     * @param args
     */
    
     /*
         Datos de entrada: Galones de gasolina
         Datos de salida: Cantidad, precio, cantidad de galones
    */
    public static void main(String[] args) {
        
        double cantGalones;
        double cantLitros;
        double valPagar;         
        double valGalon;
        String precioGal;
        
        Scanner read= new Scanner(System.in);
        System.out.println("porfavor escriba la cantidad de galones");
        cantGalones= read.nextDouble();
         
       valGalon=9.500;
       cantLitros=3.78;
        System.out.println("cantidad de galones son "+cantGalones);
        System.out.println("El precio por galon es "+valGalon);
        System.out.println("La cantidad de litros es "+(cantLitros*cantGalones)+ " litros");
        
        System.out.println("El precio total es "+(cantGalones*valGalon));
        
        
        
        
        
        
               
               

        
        
        
        
        
        
                
        
       
        
        
                
       
     
                
        
        
    }
    
}
