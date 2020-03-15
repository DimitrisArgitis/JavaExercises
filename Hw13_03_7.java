
package hw.pkg13_03_.pkg7;

import java.util.Scanner;


public class Hw13_03_7 {

    
    public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
         System.out.println("Tell me your weight");
     int w=input.nextInt();
          System.out.println("Tell me your planet");
     String p=input.next();
     if (null!=p)switch (p) {
            case "Venus":
                System.out.println("Your weight in "+p+"is: "+(w*0.78));
                break;
            case "Mars":
                System.out.println("Your weight in "+p+"is: "+(w*0.39));
                break;
            case "Jupiter":
                System.out.println("Your weight in "+p+"is: "+(w*2.65));
                break;
            case "Saturn":
                System.out.println("Your weight in "+p+"is: "+(w*1.17));
                break;
            case "Uranus":
                System.out.println("Your weight in "+p+"is: "+(w*1.05));
                break;
            case "Neptune":
                System.out.println("Your weight in "+p+"is: "+(w*1.23));
                break;
            default:
                break;
        }
        
        
    }
    
}
