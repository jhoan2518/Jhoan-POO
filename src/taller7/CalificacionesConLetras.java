/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

/**
 *
 * @author jhoan
 */
import java.util.Scanner;
public class CalificacionesConLetras {
  int total= 0;
  int CantidadNotas= 0;
  int aCount= 0;
  int bCount= 0;
  int cCount= 0;
  int dCount= 0;
  int fCount= 0;
  
  Scanner keyboard = new Scanner(System.in);
  
   System.out.println("ingrese las notas en un rango de 1 a 100");
   while (keyboard.hasNext()){
      int nota = keyboard;
      total += nota;
      ++CantidadNotas;
      
      switch(nota/10){
        case 10:
            ++aCount;
            break;
        case 9:
            ++bCount;
            break;
        case 8:
            ++cCount;
            break;
        case 7:
            ++dCount;
            break;
        default:
            ++fCount;
            break;
         
            
            
               
      }
      
    }
  
    if (CantidadNotas !=0){
    
       double average = (double) total/ CantidadNotas;
        
       System.out.println("el total de el % notas es ");
           total + CantidadNotas;
            System.out.println("class average es"+ average);
            System.out.println("numero de estudiantes que recibieron cada nota"+
                "A: " + aCount +
                        "B: " + bCount +
                        "C: " + cCount +
                        "D: " + dCount +
                        "F: " + fCount);
           
    } else{
            System.out.println("no ingresaron notas");
            
    }
  
}
