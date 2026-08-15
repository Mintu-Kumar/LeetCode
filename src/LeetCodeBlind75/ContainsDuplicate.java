package LeetCodeBlind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean duplicates(int[] nums){

        Set<Integer> unique =  new HashSet<>();

        for(int num: nums)
        {
            if(!unique.add(num))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,1};
        System.out.println(duplicates(num));
    }
}
