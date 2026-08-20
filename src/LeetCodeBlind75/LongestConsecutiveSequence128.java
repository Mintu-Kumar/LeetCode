package LeetCodeBlind75;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestConsecutiveSequence128 {

    // this code has time complexity O(n)
    public static int longestConsecutive(int[] nums) {

        Set<Integer> set =  new HashSet<>();
        for(int i:nums)
            set.add(i);

        Iterator<Integer> itr =  set.iterator();
        int mx = 0;
        while (itr.hasNext())
        {
            int val =  itr.next();
            if(!set.contains(val-1)) {
               int current = val;
               int count =1;

                while (set.contains(current+1)) {
                    current = current + 1;
                    count++;
                }
                mx = Math.max(count, mx);

            }
        }
        return  mx;
    }

    public static void main(String[] args) {
        int[] nums =  {1,0,1,2};
        System.out.println(longestConsecutive(nums));
    }
}


//This code has time complexity O(n2)
/*public static int longestConsecutive(int[] nums) {

    Set<Integer> set =  new HashSet<>();
    for(int i:nums)
        set.add(i);

    Iterator<Integer> itr =  set.iterator();
    int count=0;
    int mx = 0;
    while (itr.hasNext())
    {

        int val =  itr.next();
        while(set.contains(val)) {
            val = val + 1;
            count++;
        }
        mx = Math.max(count,mx);
        count=0;
    }
    return  mx;
}*/
