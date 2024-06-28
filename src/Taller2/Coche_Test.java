/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

import java.util.Scanner;

/**
 *
 * @author jhoan
 */
public class Coche_Test {
    public static void main(String[] args){
      
        coche vehiculo = new coche();
        vehiculo.automovil(_modelo:"oroch", _marca:"renault", _año:2009, _precio:200000000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el año actual");
        
        int año_actual= scanner.nextInt();
        float valor_inicial= vehiculo.getPrecio();
        int años_pasados= año_actual-vehiculo.getAño();
        
        double valor_actual= valor_inicial*(0.1*años_pasados);
        int convert=(int)valor_actual;
        
        System.out.println("la marca de su vehicuolo es: "+vehiculo.getMarca());
        System.out.println("el modelo de su vehiculo es: "+vehiculo.getModelo());
        System.out.println("el año de su vehiculo es "+vehiculo.getAño());
        System.out.println("el precio de: "+vehiculo.getPrecio());
        if (convert>=1){
            System.out.println("la depresiacion anual del vehiculo es del 10% anual, entonces el valor acutal de su vehiculo es de: "+convert);
        }else{
            System.out.println("la depresiacion anual del vehiculo es del 10% anual, entonces el valor acutal de su vehiculo es de:0");
                    
                    }    
        }
        
        
    }

