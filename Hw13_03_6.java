
package hw.pkg13_03_.pkg6;

import java.util.Scanner;


public class Hw13_03_6 {

    
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       System.out.println("Tell me your age");
       byte age=input.nextByte();       
       if(age>0&&age<=16){
        System.out.println("You cannot do anything");
       }else if(age<=17){
        System.out.println("You can drive but not vote");
       }else if(age<=21){
        System.out.println("You can vote but not drink");
       }else if (age>21){
        System.out.println("You can do everything");
       }else{
        System.out.println("Wrong age");
       }

    }
    
}
