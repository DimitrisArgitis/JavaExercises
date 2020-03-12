
package hw12_03_c;

import java.util.Scanner;


public class HW12_03_C {

    
    public static void main(String[] args) {
               Scanner input=new Scanner(System.in);
               System.out.println("Give me the width");
               double width=input.nextDouble();
               System.out.println("Give me the height");
               double height=input.nextDouble();
               double area=height*width;
               double per=2*height+2*width;
             System.out.println("The Surface area is "+area);
             System.out.println("The perimetre is "+per);



    }
    
}
