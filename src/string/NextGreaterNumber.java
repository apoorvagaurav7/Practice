package string;

import java.util.Stack;

public class NextGreaterNumber {

    public static void NGN(int arr[], int n){
        Stack<Integer> s = new Stack<Integer>();
        int arr2[] = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!s.empty() && s.peek() <=arr[i])
                s.pop();
            if(s.empty())
                arr2[i] = -1;
            else
                arr2[i] = s.peek();
            s.push(arr[i]);
        }
        for(int i=0;i<n;i++)
            System.out.print(arr2[i]);

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25, 10};
        int n = arr.length;
        NGN(arr,n);
    }
}
