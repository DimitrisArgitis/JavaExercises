
package hw13_03_.pkg5;

import java.util.Scanner;


public class Hw13_03_5 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Tell me your grade");
        String bathmos=input.next();
        
         if (null==bathmos){
             System.out.println("Fail");
         }else switch (bathmos) {
            case "A":
                System.out.println("Perfect");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
            case "D":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    
}
}