package array.TwoD;


/*For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.*/
public class RowSum {

    public static void main(String[] args) {
            int[][] mat = {{1,2,3},{3,4,5},{9,7,6}};
            rowWiseSum(mat);

        }

    public static void rowWiseSum(int[][] mat) {
        //Your code goes here

        int sum=0;
        int m = mat.length;
        if(m==0){
            return;
        }
        int n = mat[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum +=mat[i][j];
            }
            System.out.print(sum+" ");
            sum=0;
        }
    }

}
