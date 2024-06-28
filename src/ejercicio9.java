/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhoan
 */
import java.util.Random;
public class ejercicio9 {
     public static void main(String[] args){
         Random randomnumbers = new Random();
         int[] frequency = new int[7];
         
         for (int roll=1; roll<= 600000; roll++)
            ++frequency[1+ randomnumbers.nextInt(6)];
            System.out.printf("%s%10s\n", "face", "frequency");
            
            for (int face=1; face< frequency.length; face++)
                System.out.printf("4d%10d\n",face, frequency[face]);
                    
     }
     
}
