package leetcode.easy;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public void input(Scanner scanner) {

        System.out.print("입력할 숫자의 갯수 :");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "번째 문자열 : ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("result : " + removeDuplicates(nums));
    }


    public int removeDuplicates(int[] nums) {
        int result = nums.length;
        int cur = nums[0];
        int duplicateIndex = 1;

        for (int i = 1; i<nums.length; i++){
            if(nums[i] == cur){
                result--;
            }
            else {
                cur = nums[i];
                nums[duplicateIndex] = nums[i];
                duplicateIndex++;
                //test 통과기준이 nums1, expectedNums 간의 값의 비교로 이뤄짐
                //앞으로 이동시켜주면 됨(올바른 길이 까지만 검증)
            }
        }
        return result;
    }
}
