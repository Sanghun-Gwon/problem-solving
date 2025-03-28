package leetcode.easy;

import common.Difficulty;
import common.LeetCodeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum implements LeetCodeProblem {

    @Override
    public String getName() {
        return "Two Sum";
    }

    @Override
    public Difficulty getDifficulty() {
        return Difficulty.EASY;
    }

    @Override
    public void execute(Scanner scanner) {

        System.out.print("입력할 숫자의 갯수 :");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + "번째 숫자 : ");
            nums[i] = scanner.nextInt();
        }
        System.out.print("target :");
        int target = scanner.nextInt();

        System.out.println("result : " + Arrays.toString(twoSum(nums, target)));

    }

    private int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];


        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
