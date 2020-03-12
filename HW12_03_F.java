
package hw12_03_f;

import java.util.Scanner;


public class HW12_03_F {

    
    public static void main(String[] args) {
             Scanner input=new Scanner(System.in);
             System.out.println("Give me the temperature in Fahrenait");
             double F=input.nextByte();
             double C=(F-32)/1.8;
             System.out.println("The temperature in celsius is: "+C);

    }
    
}
