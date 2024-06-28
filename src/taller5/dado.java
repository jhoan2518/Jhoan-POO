/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author jhoan
 */
import java.util.Random;

public class dado {

    /**
     *
     * @return
     */
    private static int rollDice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private enum Status {CoNTINUE, LOST, Won,}
    
    public static void main(String[] args){
        int plus= 0;
        final int pas1 =7;
        final int pas2 =11;
        final int pas3 =2;       
        final int pas4 = 3;
        final int pas5 =12;
        int mypoint= 0;
        Status gameStatus;
        plus = rollDice();
        switch (plus){
            case pas1:
            case pas2: 
                gameStatus = Status.Won;  
                break;
            case pas3:
            case pas4:
            case pas5 :       
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus= Status.CoNTINUE;
                mypoint=plus;
                System.out.println("your point is"+ mypoint);
                break;
        }
        while (gameStatus == Status.CoNTINUE){
            plus = rollDice();
            if (plus == mypoint) gameStatus= Status.Won;
            else if (plus == pas1) gameStatus= Status.LOST;
        }
        if (gameStatus == Status.Won){
            System.out.println("players wins");
        }else {
            System.out.println("players loses");
            
        }
                
    }
    public static int rollDice(){
       Random numbdice= new Random();
       int firstdice = 1 + numbdice.nextInt(6);
       int seconddice= 1 + numbdice.nextInt(6);
       int sum= firstdice + seconddice;
        System.out.println("el numero del primer dado es: "+ firstdice);
        System.out.println("el numero del segundo dado es"+ seconddice);
        System.out.println(firstdice +" + " + seconddice +" = " + sum );
        return sum;
    }
}

