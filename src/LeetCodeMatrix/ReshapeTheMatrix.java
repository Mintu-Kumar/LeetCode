package LeetCodeMatrix;

import java.util.Arrays;

public class ReshapeTheMatrix {


    public static int[][] reshape(int[][] mat, int r, int c){
        int m = mat.length;
        int n = mat[0].length;
        if(m*n!=r*c)
            return mat;

        int[][] newMat = new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index = i*n+j;
                int newRow = index/c;
                int newCol = index%c;
                newMat[newRow][newCol] = mat[i][j];
            }
        }
        return newMat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r=2,c=4;

        int[][] result =  reshape(mat,r,c);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
