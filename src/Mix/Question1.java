package Mix;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
      /*  Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =0;

        for(int i=1;count<n;i++){
            int j = 3*i+2;
                if (j % 4 != 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        decToBinary(n);
    }

    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[32];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
        }

