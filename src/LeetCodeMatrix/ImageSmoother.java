package LeetCodeMatrix;


/*An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the average of the cell
and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother). If one or more of the surrounding cells of
a cell is not present, we do not consider it in the average (i.e., the average of the four cells in the red smoother).*/


public class ImageSmoother {

    public static int[][] imageSmoother(int[][] img)
    {
        int m=img.length, n=img[0].length;
        int[][] res =  new int[m][n];

        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0,count=0;

                for(int r=i-1;r<=i+1;r++){
                    for(int c=j-1;c<=j+1;c++){
                        if(r>=0&& r<m && c>=0&& c<n){
                            sum+=img[r][c];
                            count++;
                        }
                    }
                }
                res[i][j] =  sum/count;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};
        int[][] result = imageSmoother(img);

        for (int[] row : result) {
            System.out.println(java.util.Arrays.toString(row));
        }

    }
}
