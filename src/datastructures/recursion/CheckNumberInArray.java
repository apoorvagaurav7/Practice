package datastructures.recursion;

public class CheckNumberInArray {

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input,x,0);
    }
    private static boolean checkNumber(int input[],int x,int startIndex){
        if(startIndex==input.length)
            return false;
        if(input[startIndex]==x)
            return true;
        return checkNumber(input,x,startIndex+1);
    }

    public static void main(String[] args) {
        int input[] = {1,2,3};
        System.out.println(checkNumber(input,0));
    }
}
