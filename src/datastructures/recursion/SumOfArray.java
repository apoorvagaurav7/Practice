package datastructures.recursion;

public class SumOfArray {
    public static int sum(int input[]) {

        int n = input.length;
        if(n<=0){
            return 0;
        }
        return sum(input) + input[n];
    }

    public static void main(String[] args) {
        int input[] = {1,2,3};
        System.out.println(sum(input));
    }
}
