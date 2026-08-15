package LeetCodeBlind75;


// read   README.md file

public class ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        int reversed = reverseBits(num);
        System.out.println("Original: " + num);
        System.out.println("Reversed bits: " + reversed);
    }
}

