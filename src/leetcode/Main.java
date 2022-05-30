package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        CombinationSum sum = new CombinationSum();
        System.out.println(sum.combinationSum(candidates, target));
    }
}
