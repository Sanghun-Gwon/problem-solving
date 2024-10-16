import leetcode.easy.LongestCommonPrefix;
import leetcode.easy.TwoSum;
import leetcode.easy.ValidParentheses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. two sum");
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("result : " + Arrays.toString(twoSum.twoSum(nums, target)));

        System.out.println("14. longest common prefix");
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower", "flow","flight"};
        System.out.println("result : " + longestCommonPrefix.longestCommonPrefix(strs));


        System.out.println("20. valid parentheses");
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "()[]{}";
        System.out.println("result : " + validParentheses.isValid(s));

    }
}