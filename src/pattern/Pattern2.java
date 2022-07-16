package pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 4;
        int i=0;
        int space = n-1;
        while(i<=n){
            int j=1;
           // System.out.println(" ");
            while(j<=i){
               // System.out.print(" ");
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
