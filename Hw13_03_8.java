
package hw13_03_.pkg8;

import java.util.Scanner;


public class Hw13_03_8 {

   
    public static void main(String[] args) {
             Scanner input=new Scanner (System.in);
      System.out.println("Tell me your age: ");
      int age=input.nextInt();
      System.out.println(age>=18?"You are an adult" : "You are not an adult");
    }
    
}
