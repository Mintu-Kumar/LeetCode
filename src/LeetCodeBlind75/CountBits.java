package LeetCodeBlind75;

public class CountBits {

    public static int[] countBits(int n) {
       int[] result =  new int[n+1];
      result[0] = 0;
       for(int i=1;i<=n;i++){
           int count=0;
           int temp = i;
           while (temp > 0) {
               count += (temp & 1);
               temp >>= 1;
           }
           result[i] = count;
       }
       return  result;
    }

    public static void main(String[] args) {

        int[] result = countBits(2);

        for (int row : result) {
            System.out.println(row);
        }
    }
}
