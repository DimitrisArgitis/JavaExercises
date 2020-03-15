
package hw13_03_.pkg3;

import java.util.Scanner;


public class Hw13_03_3 {
    
    public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
     System.out.println("Pick a month");
      String a=input.next();
      if (null!=a)switch (a) {
            case "December":
            case "January":
            case "February":
                System.out.println("It's Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It's Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("It's Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("It's Autumn");
                break;
            default:
                break;
        }
             
   }
}

        
        
        
    
