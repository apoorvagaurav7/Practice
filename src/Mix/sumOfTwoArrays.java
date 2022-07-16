package Mix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;


public class sumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        //Your code goes here
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0,num=0,s=0;

        int l = max(arr1.length, arr2.length) + 1;
        while (i >= 0 && j >= 0) {
             num = arr1[i] + arr2[j] + carry;
             s = num % 10;
            carry = num / 10;
            output[l - 1] = s;
            l = l - 1;
            i = i - 1;
            j = j - 1;
        }
        while (i >= 0){
            num = arr1[i] + carry;
        s = num % 10;
        carry = num/10;
        output[l - 1] = s;
        l = l - 1;
        i = i - 1;
    }
        while (j >= 0) {
            num = arr2[j] + carry;
            s = num % 10;
            carry = num / 10;
            output[l - 1] = s;
            l = l - 1;
            j = j - 1;
        }
            if (carry != 0)
            output[0] = carry;

    }



    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr1 = takeInput();
            int[] arr2 = takeInput();

            int[] output = new int[1 + max(arr1.length, arr2.length)];

            sumOfTwoArrays(arr1, arr2, output);
            printArray(output);

            t -= 1;
        }
    }
}
