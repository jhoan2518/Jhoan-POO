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
public class promedio_de_clase {

    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        
        int total=0;
        int NumeroDeNotas=0;
        
        System.out.println("ingrese una nota o -1 para quitar");
        int nota = input.nextInt();
        while (nota != -1){
            total = total + nota;
            NumeroDeNotas = NumeroDeNotas + 1;
            System.out.println("ingrese una nota o -1 para quitar");
            nota= input.nextInt();
        }
        if (NumeroDeNotas != 0){
            double average = (double) total / NumeroDeNotas;
            
            System.out.println(NumeroDeNotas + " total de las " + total + " notas ingresadas es %d%n");
            System.out.println("class average is %.2f%n" + average);
            
        }else{
            System.out.println("no ingresaron notas");
            
        }   
    }
}
