/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

/**
 *
 * @author jhoan
 */
import java.util.Scanner;
public class promedio1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int total=0;
        int NumeroDeNotas= 1;
        
        while (NumeroDeNotas<= 10){
            System.out.println("ingrese la nota");
            int nota= input.nextInt();
            total= total + nota;
            NumeroDeNotas= NumeroDeNotas+1;
            
        }
        
        int average = total /10;
        
        System.out.println("%n total de todas las 10 notas es %d%n");
        System.out.println("clase average is %d%n " + average);
    }
}
