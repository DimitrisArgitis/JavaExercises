
package hw_12_03_d;

import java.util.Scanner;


public class HW_12_03_D {

   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     System.out.println("Give the seconds");
     int sec=input.nextInt();
     int hour=sec/3600;
     int min=(sec%3600)/60;
     int sec2=min&60;
    System.out.println(hour +" hour(s) "+min+" mins "+sec2 +" seconds");
   }
    
}
