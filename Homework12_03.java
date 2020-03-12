
package homework12_03;

import java.util.Scanner;


public class Homework12_03 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the length of the radius?");
        double r=input.nextDouble();
        double per=2*Math.PI*r;
        double area=Math.PI*r*r;
        System.out.printf("The perimeter of the circle is %f " ,per);
        System.out.println();
        System.out.printf("The surface are of the circle %f ",area);
    }
    
}
