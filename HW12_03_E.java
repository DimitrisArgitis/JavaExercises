
package hw12_03_e;

import java.util.Scanner;


public class HW12_03_E {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        for (int i=1;i<=3;i++){
         System.out.println("Give me his/her year of birth ");
         short birth=input.nextShort();
                  System.out.println("Give me his/her name ");
         String name=input.next();
         System.out.println("His/her name is "+name);
         System.out.println("His/her year of birth is "+birth);
        }       
    }
    
}
