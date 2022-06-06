package leetcode;

import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {5, 2, 3};
        int target = 8;
        List<List<Integer>> output = combinationSum(candidates, target);
        System.out.println(output);
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0) {
            System.out.println(remain + " remain is less than 0");
            return;
        } else if (remain == 0) {
            System.out.println(remain + " is zero so this is an acceptable combination");
            System.out.println(tempList);
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < nums.length; i++) {
                System.out.println(String.format("We are at index %s which is %s add to the temp list", i, nums[i]));
                tempList.add(nums[i]);
                System.out.println(tempList);
                int newRemain = remain-nums[i];
                System.out.println("the new remain is " + newRemain);
                backtrack(result, tempList, nums, newRemain, i);
                tempList.remove(tempList.size() - 1);
                System.out.println("item is removed, list is " + tempList);
            }
        }
    }
}
