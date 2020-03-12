
package hw12_03_h;

import java.util.Scanner;


public class HW12_03_H {

    
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
      System.out.println("Give me the price of the object");
       double price=input.nextDouble();
       System.out.println("The price after the 10% discount is " +(price*0.9));
       System.out.println("The price after the 20% discount is " +(price*0.8));
       System.out.println("The price after the 30% discount is " +(price*0.7));
       System.out.println("The price after the 40% discount is " +(price*0.6));
       System.out.println("The price after the 50% discount is " +(price*0.5));
       System.out.println("The price after the 60% discount is " +(price*0.4));
    }
    
}
