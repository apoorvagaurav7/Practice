package array.TwoD;

/*For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.*/
public class LargestRowCoulmnSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{3,4,5},{9,7,6}};
        findLargest(mat);

    }

    public static void findLargest(int[][] mat) {
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
