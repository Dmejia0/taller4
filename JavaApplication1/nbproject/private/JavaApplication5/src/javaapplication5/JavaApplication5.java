/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        char opcion;
        int i;
        int j;
        int x;
        double suma;
        double promedio;
        double notasParciales[] = new double [4];
        double notaExamen;
        int cantidadMaterias;
       
        
        System.out.println("Calcular el promedio de un estudiante:");
        System.out.println("Opcion 1: Ingrese notas del estudiante ");
        System.out.println("Opcion 2: salir ");
        System.out.println("Ingrese su opcion:\n");
        opcion = leer.next().charAt(0);
        
        switch(opcion) {
            case'1': 
                
                System.out.println("Cuantas materias desea promediar?\n");
                cantidadMaterias = leer.nextInt();
                
                for(j=0;j<cantidadMaterias; j++){
                    suma=0;
                    System.out.println("Materia " + (j+1) +" \n");
                    
                    for(i=1;i<=3;i++){
                    
                        System.out.println("Ingrese nota parcial " + i + "\n" );
                        notasParciales[i] = leer.nextDouble();

                        suma = suma+notasParciales[i];
                    }
                    
                    System.out.println("\nLas notas ingresadas fueron:");
                    
                    for(x=1; x<=3; x++){
                        
                        System.out.println("Nota "+ x + ": "+ notasParciales[x]);
                    }
                
                    System.out.println("\nEl total de la notas parciales fueron: " + suma + "\n" );

                    System.out.println("Ingrese nota Examen \n");
                    notaExamen = leer.nextDouble();

                    System.out.println("La nota del examen fue:" + notaExamen + "\n");

                    promedio = (suma+notaExamen)/4;
                    
                    System.out.println("El promedio total fue: " + promedio + "\n");

                    if(promedio>=3.0 && promedio <=5.0){
                        System.out.println("El estudiante APROBO \n");

                    }
                    else if(promedio>=0 && promedio <=3.0){
                        System.out.println("El estudiante REPROBO \n");
                    }
                    
                }
                
                break;
          
            case'2': 
                
                System.out.println("Gracias");
        }
    }
    
}
