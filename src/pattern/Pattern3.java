package pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int i=1;
        System.out.println("*");
        while(i<=n){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j=1;
            int k=i-1;
            while(j<=i-1){
                System.out.print(k);
                k--;
                j++;
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        i=n-1;
        while(i>=1){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j=1;
            int k = i-1;
            while(j<=i-1){
                System.out.print(k);
                k--;
                j++;
            }
            System.out.print("*");
            System.out.println();
            i--;
        }
        System.out.print("*");
    }
}
