/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author jhoan
 */
public class interes {
    public static void main(String[] args){
        
        double operacion;
        double principal= 1000;
        double interess= 0.05;
        System.out.println("year           amountondeposit");
        for (int year=1; year <=10; year++){
          operacion= principal*Math.pow(1+interess, year);
          System.out.println(year "          " + operacion);
            
        }
    }
}
