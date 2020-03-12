
package hw12_03_b;


public class HW12_03_b {

    
    public static void main(String[] args) {
        
    byte x=1;
    byte y=2;
    byte a=(byte) (-x+x++*2);
    System.out.println("a="+a);
    byte b=(byte) ((x++ + --y) + --y);
    System.out.println("b="+b);
    byte c= (byte) (x + x);
    System.out.println("c="+c);
    System.out.println("x ="+c+" y="+y);

    
}
    }
    

