
package hw.pkg13_03.pkg1;

import java.util.Scanner;


public class Hw13_031 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Tell me your age:");
        byte age=input.nextByte();
        char q;
        if(age<0){
         System.out.println("Wrong number, you are not serious");
         q='A';
        }else if (age<5){
        System.out.println("You are not attending class yet");
         q='B';
        }else if(age<=12){
        System.out.println("You are attending junior school");
        q='C';
        }else if(age<=15){
        System.out.println("You are attending junior high school");
        q='D';
        }else if(age<=18){
        System.out.println("You are attending high school");
        q='E';
        }else{
        System.out.println("You are not attending class any more");
        q='F';
        }
        switch(q){
            case 'A':  
              System.out.println("Wrong number, you are not serious");
            break;
            case 'B':
              System.out.println("You are attending junior school");
            break;
            case 'C':
              System.out.println("You are attending junior school");
            break;
            case'D':
              System.out.println("You are attending junior high school");
            break;
            case'E':
              System.out.println("You are attending high school");
            break;
            case'F':
              System.out.println("You are not attending class any more"); 
            break;
         }
        
        
    }
    
}
