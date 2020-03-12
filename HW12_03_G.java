
package hw12_03_g;

import java.util.Scanner;


public class HW12_03_G {

    
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
      System.out.println("Give me the length in inches:");
       double inc=input.nextDouble();
       double meter=inc*0.0254;
             System.out.println("The length after convertion is: "+meter+" meters");

    }
    
}
