/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleres_poo.taller1;

/**
 *
 * @author jhoan
 */
public class test_notas {
  
    public static void main(String[] args){
    
        Notas planilla = new Notas("");
        planilla.setNombreDelCurso("");
        Notas planilla1 = new Notas ("");
        planilla1.setNombreDelCurso("");
        
        String message = planilla.displayMessage();
        System.out.println(message);
        String message1 = planilla1.displayMessage();
        System.out.println(message1);
    }
}
