package pattern;

import java.util.Scanner;

public class PatternExample {
    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);
        int n = s.nextInt();*/
        int n = 4;
        int i =1;
     while(i<=n){
         int j=1;
         int n2 = 1;
         while(j<=i){
             System.out.print(n2);
             n2++;
             j++;
         }
         System.out.println();
         i++;
     }
    }
}