package Mix;

public class test12 {
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        int len = arr.length;
        int temp[] = new int[d];
        for (int j = 0; j < d; j++) {
            temp[j] = arr[j];
        }
        for (int i = d; i < len; i++) {
            arr[i-d] = arr[i];
        }
        int j=0;
        for (int i=len-d;i<len;i++){
            arr[i]=temp[j++];
        }
    }

    public static int secondLargestElement(int[] arr) {
        //Your code goes here
        // Arrays.sort(arr);
        int l,sl;
        l= sl = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            }else if(arr[i]>sl && arr[i]!=l){
                sl =arr[i];
            }

        } return sl;
    }

        public static void main(String args[]){
       int arrr[] = {1,6,3,9,10};
       int d1 =2;
      // rotate(arrr,d1);

       //int n= secondLargestElement(arrr);
        for (int i = 0; i < arrr.length; i++) {
            System.out.print(arrr[i] + " ");
        }
           // System.out.println(n);
    }
}