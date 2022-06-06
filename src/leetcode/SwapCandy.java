package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SwapCandy {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {2,3};

        System.out.println(Arrays.toString(fairCandySwap(b, a)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        Set<Integer> set = new HashSet<>();

        for(int a : aliceSizes){
            sumA += a;
            set.add(a);
        }

        for(int b : bobSizes){
            sumB += b;
        }

        int diff = (sumA - sumB) / 2;

        int[] ans = new int[2];
        for(int num : bobSizes){
            if(set.contains(num + diff)){
                ans[0] = num + diff;
                ans[1] = num;
                break;
            }
        }

        return ans;
    }
}
