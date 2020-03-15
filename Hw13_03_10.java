
package hw13_03_.pkg10;

import java.util.Scanner;


public class Hw13_03_10 {

    
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
    System.out.println("How many rows does the class have");
    int r=input.nextInt();
    System.out.println("How many students does the class have");
    int p=input.nextInt();
    int l=p/r;
    if (p%r>0){
      l+=1;
              }
    String [][] array=new String[r][l];
    System.out.println("The class has "+r+" rows and "+l+" lines");
    int k=0;
    int i=0;
    System.out.println("Give me the names");
    while (i<r){       
     int j=0;
     while (j<l&&k<p){     
      array[i][j]=input.next();
      j+=1;
      k=k+1; 
                      }
      i+=1;   
    }    
    for (i=0;i<r;i++){
     for(int j=0;j<l;j++){
      System.out.print(array[i][j]+" ");
     }
     System.out.println();
    }
    }
   
}
